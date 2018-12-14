package com.dl7.shownew.injector.modules;


import com.dl7.shownew.adapter.BaseVideoDLAdapter;
import com.dl7.shownew.adapter.VideoCompleteAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.base.IRxBusPresenter;
import com.dl7.shownew.module.manage.download.complete.VideoCompleteFragment;
import com.dl7.shownew.module.manage.download.complete.VideoCompletePresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/16.
 * video 缓存完成 Module
 */
@Module
public class VideoCompleteModule {

    private final VideoCompleteFragment mView;

    public VideoCompleteModule(VideoCompleteFragment view) {
        this.mView = view;
    }

    @PerFragment
    @Provides
    public IRxBusPresenter providePresenter(DaoSession daoSession, RxBus rxBus) {
        return new VideoCompletePresenter(mView, daoSession.getVideoInfoDao(), rxBus);
    }

    @PerFragment
    @Provides
    public BaseVideoDLAdapter provideAdapter(RxBus rxBus) {
        return new VideoCompleteAdapter(mView.getContext(), rxBus);
    }
}
