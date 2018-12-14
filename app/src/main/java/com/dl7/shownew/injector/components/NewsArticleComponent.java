package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.NewsArticleModule;
import com.dl7.shownew.module.news.article.NewsArticleActivity;
import dagger.Component;

/**
 * Created by long on 2017/2/3.
 * 新闻详情 Component
 */
@PerActivity
@Component(modules = NewsArticleModule.class)
public interface NewsArticleComponent {
    void inject(NewsArticleActivity activity);
}
