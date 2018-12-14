package com.dl7.shownew.injector.modules;


import com.dl7.shownew.adapter.ViewPagerAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.base.IRxBusPresenter;
import com.dl7.shownew.module.news.main.NewsMainFragment;
import com.dl7.shownew.module.news.main.NewsMainPresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/20.
 * 新闻主页 Module
 */
@Module
public class NewsMainModule {

    private final NewsMainFragment mView;

    public NewsMainModule(NewsMainFragment view) {
        mView = view;
    }

    @PerFragment
    @Provides
    public IRxBusPresenter provideMainPresenter(DaoSession daoSession, RxBus rxBus) {
        return new NewsMainPresenter(mView, daoSession.getNewsTypeInfoDao(), rxBus);
    }

    @PerFragment
    @Provides
    public ViewPagerAdapter provideViewPagerAdapter() {
        return new ViewPagerAdapter(mView.getChildFragmentManager());
    }
}
