package com.dl7.shownew.injector.components;

import android.content.Context;

import com.dl7.shownew.injector.modules.ApplicationModule;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.rxbus.RxBus;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by long on 2016/8/19.
 * Application Component
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(BaseActivity baseActivity);

    // provide
    Context getContext();
    RxBus getRxBus();
    DaoSession getDaoSession();
}
