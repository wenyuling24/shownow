package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.ManageAdapter;
import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.news.channel.ChannelActivity;
import com.dl7.shownew.module.news.channel.ChannelPresenter;
import com.dl7.shownew.module.news.channel.IChannelPresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/8/31.
 * 管理
 */
@Module
public class ChannelModule {

    private final ChannelActivity mView;

    public ChannelModule(ChannelActivity view) {
        mView = view;
    }

    @Provides
    public BaseQuickAdapter provideManageAdapter() {
        return new ManageAdapter(mView);
    }

    @PerActivity
    @Provides
    public IChannelPresenter provideManagePresenter(DaoSession daoSession, RxBus rxBus) {
        return new ChannelPresenter(mView, daoSession.getNewsTypeInfoDao(), rxBus);
    }
}
