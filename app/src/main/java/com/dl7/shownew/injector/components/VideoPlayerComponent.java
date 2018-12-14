package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.VideoPlayerModule;
import com.dl7.shownew.module.video.player.VideoPlayerActivity;
import dagger.Component;

/**
 * Created by long on 2016/11/30.
 * Video Component
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = VideoPlayerModule.class)
public interface VideoPlayerComponent {
    void inject(VideoPlayerActivity activity);
}
