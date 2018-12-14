package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.VideoListModule;
import com.dl7.shownew.module.video.list.VideoListFragment;
import dagger.Component;

/**
 * Created by long on 2016/10/11.
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = VideoListModule.class)
public interface VideoListComponent {
    void inject(VideoListFragment fragment);
}
