package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.VideoLoveAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.base.ILocalPresenter;
import com.dl7.shownew.module.manage.love.video.LoveVideoFragment;
import com.dl7.shownew.module.manage.love.video.LoveVideoPresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/13.
 * Video收藏
 */
@Module
public class LoveVideoModule {

    private final LoveVideoFragment mView;

    public LoveVideoModule(LoveVideoFragment view) {
        this.mView = view;
    }

    @PerFragment
    @Provides
    public ILocalPresenter providePresenter(DaoSession daoSession, RxBus rxBus) {
        return new LoveVideoPresenter(mView, daoSession.getVideoInfoDao(), rxBus);
    }

    @PerFragment
    @Provides
    public BaseQuickAdapter provideAdapter() {
        return new VideoLoveAdapter(mView.getContext());
    }
}
