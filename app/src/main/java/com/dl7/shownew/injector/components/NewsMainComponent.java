package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.NewsMainModule;
import com.dl7.shownew.module.news.main.NewsMainFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/20.
 * 主页 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = NewsMainModule.class)
public interface NewsMainComponent {
    void inject(NewsMainFragment fragment);
}
