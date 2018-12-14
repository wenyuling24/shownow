package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.NewsDetailModule;
import com.dl7.shownew.module.news.detail.NewsDetailActivity;
import dagger.Component;

/**
 * Created by long on 2016/8/25.
 * 新闻详情 Component
 */
@Deprecated
@PerActivity
@Component(modules = NewsDetailModule.class)
public interface NewsDetailComponent {
    void inject(NewsDetailActivity activity);
}
