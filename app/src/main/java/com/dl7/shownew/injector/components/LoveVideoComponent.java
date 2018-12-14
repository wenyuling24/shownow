package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.LoveVideoModule;
import com.dl7.shownew.module.manage.love.video.LoveVideoFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/13.
 * Video收藏 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = LoveVideoModule.class)
public interface LoveVideoComponent {
    void inject(LoveVideoFragment fragment);
}
