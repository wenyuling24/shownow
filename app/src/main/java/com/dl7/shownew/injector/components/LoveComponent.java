package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.LoveModule;
import dagger.Component;

/**
 * Created by long on 2016/9/28.
 * 收藏 Component
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = LoveModule.class)
public interface LoveComponent {
//    void inject(LoveActivity activity);
}
