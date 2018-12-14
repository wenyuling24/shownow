package com.dl7.shownew;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.dl7.downloaderlib.DownloadConfig;
import com.dl7.downloaderlib.FileDownloader;
import com.dl7.shownew.api.RetrofitService;
import com.dl7.shownew.engine.DownloaderWrapper;
import com.dl7.shownew.injector.components.ApplicationComponent;
import com.dl7.shownew.injector.components.DaggerApplicationComponent;
import com.dl7.shownew.injector.modules.ApplicationModule;
import com.dl7.shownew.local.dao.NewsTypeDao;
import com.dl7.shownew.local.table.DaoMaster;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.rxbus.RxBus;
import com.dl7.shownew.utils.CrashHandler;
import com.dl7.shownew.utils.DownloadUtils;
import com.dl7.shownew.utils.PreferencesUtils;
import com.dl7.shownew.utils.ToastUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;

import org.greenrobot.greendao.database.Database;

import java.io.File;

/**
 * Created by long on 2016/8/19.
 * Application
 */
public class AndroidApplication extends Application {

    private static final String DB_NAME = "news-db";

    private static ApplicationComponent sAppComponent;
    private static Context sContext;
    private DaoSession mDaoSession;
    // 因为下载那边需要用，这里在外面实例化在通过 ApplicationModule 设置
    private RxBus mRxBus = new RxBus();



    //@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    //public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks callback) {
    //   registerActivityLifecycleCallbacks(callback);
    //}

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        _initDatabase();
        _initInjector();
        _initConfig();
    }

    /**
     * 使用Tinker生成Application，这里改成静态调用
     * @return
     */
    public static ApplicationComponent getAppComponent() {
        return sAppComponent;
    }

    public static Context getContext() {
        return sContext;
    }

    /**
     * 初始化注射器
     */
    private void _initInjector() {
        // 这里不做注入操作，只提供一些全局单例数据
        sAppComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this, mDaoSession, mRxBus))
                .build();
    }

    /**
     * 初始化数据库
     */
    private void _initDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, DB_NAME);
        Database database = helper.getWritableDb();
        mDaoSession = new DaoMaster(database).newSession();
        NewsTypeDao.updateLocalData(this, mDaoSession);
        DownloadUtils.init(mDaoSession.getBeautyPhotoInfoDao());
    }

    /**
     * 初始化配置
     */
    private void _initConfig() {
        if (BuildConfig.DEBUG) {
            LeakCanary.install(this);
            Logger.addLogAdapter(new AndroidLogAdapter());
        }
        CrashHandler.getInstance().init(this);
        RetrofitService.init();
        ToastUtils.init(this);
        DownloaderWrapper.init(mRxBus, mDaoSession.getVideoInfoDao());
        FileDownloader.init(this);
        DownloadConfig config = new DownloadConfig.Builder()
                .setDownloadDir(PreferencesUtils.getSavePath(this) + File.separator + "video/").build();
        FileDownloader.setConfig(config);
    }
}
