package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.VideoMainModule;
import com.dl7.shownew.module.video.main.VideoMainFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/20.
 * 视频主界面 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = VideoMainModule.class)
public interface VideoMainComponent {
    void inject(VideoMainFragment fragment);
}
