package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.RelatedNewsAdapter;
import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.news.detail.NewsDetailActivity;
import com.dl7.shownew.module.news.detail.NewsDetailPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/8/25.
 * 新闻详情 Module
 */
@Deprecated
@Module
public class NewsDetailModule {

    private final String mNewsId;
    private final NewsDetailActivity mView;

    public NewsDetailModule(NewsDetailActivity view, String newsId) {
        mNewsId = newsId;
        mView = view;
    }

    @PerActivity
    @Provides
    public BaseQuickAdapter provideRelatedAdapter() {
        return new RelatedNewsAdapter(mView);
    }

    @PerActivity
    @Provides
    public IBasePresenter providePresenter() {
        return new NewsDetailPresenter(mNewsId, mView);
    }
}
