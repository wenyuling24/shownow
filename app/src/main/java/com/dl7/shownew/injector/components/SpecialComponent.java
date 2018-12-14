package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.SpecialModule;
import com.dl7.shownew.module.news.special.SpecialActivity;
import dagger.Component;

/**
 * Created by long on 2016/8/26.
 * 专题 Component
 */
@PerActivity
@Component(modules = SpecialModule.class)
public interface SpecialComponent {
    void inject(SpecialActivity activity);
}
