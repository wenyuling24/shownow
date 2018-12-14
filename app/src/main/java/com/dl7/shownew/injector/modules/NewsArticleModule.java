package com.dl7.shownew.injector.modules;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.news.article.NewsArticleActivity;
import com.dl7.shownew.module.news.article.NewsArticlePresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2017/2/3.
 * 新闻详情 Module
 */
@Module
public class NewsArticleModule {

    private final String mNewsId;
    private final NewsArticleActivity mView;

    public NewsArticleModule(NewsArticleActivity view, String newsId) {
        mNewsId = newsId;
        mView = view;
    }

    @PerActivity
    @Provides
    public IBasePresenter providePresenter() {
        return new NewsArticlePresenter(mNewsId, mView);
    }

}
