package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.NewsMultiListAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.news.newslist.NewsListFragment;
import com.dl7.shownew.module.news.newslist.NewsListPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/8/23.
 * 新闻列表 Module
 */
@Module
public class NewsListModule {

    private final NewsListFragment mNewsListView;
    private final String mNewsId;

    public NewsListModule(NewsListFragment view, String newsId) {
        this.mNewsListView = view;
        this.mNewsId = newsId;
    }

    @PerFragment
    @Provides
    public IBasePresenter providePresenter() {
        return new NewsListPresenter(mNewsListView, mNewsId);
    }

    @PerFragment
    @Provides
    public BaseQuickAdapter provideAdapter() {
        return new NewsMultiListAdapter(mNewsListView.getContext());
    }
}
