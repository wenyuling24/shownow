package com.dl7.shownew.injector.modules;


import com.dl7.shownew.adapter.BaseVideoDLAdapter;
import com.dl7.shownew.adapter.VideoCacheAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.base.IRxBusPresenter;
import com.dl7.shownew.module.manage.download.cache.VideoCacheFragment;
import com.dl7.shownew.module.manage.download.cache.VideoCachePresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/16.
 * video缓存Module
 */
@Module
public class VideoCacheModule {

    private final VideoCacheFragment mView;

    public VideoCacheModule(VideoCacheFragment view) {
        this.mView = view;
    }

    @PerFragment
    @Provides
    public IRxBusPresenter providePresenter(DaoSession daoSession, RxBus rxBus) {
        return new VideoCachePresenter(mView, daoSession.getVideoInfoDao(), rxBus);
    }

    @PerFragment
    @Provides
    public BaseVideoDLAdapter provideAdapter(RxBus rxBus) {
        return new VideoCacheAdapter(mView.getContext(), rxBus);
    }
}
