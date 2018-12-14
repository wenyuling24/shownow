package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.VideoCompleteModule;
import com.dl7.shownew.module.manage.download.complete.VideoCompleteFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/16.
 * video 缓存完成 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = VideoCompleteModule.class)
public interface VideoCompleteComponent {
    void inject(VideoCompleteFragment fragment);
}
