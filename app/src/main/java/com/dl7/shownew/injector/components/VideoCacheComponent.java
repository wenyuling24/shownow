package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.VideoCacheModule;
import com.dl7.shownew.module.manage.download.cache.VideoCacheFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/16.
 * video缓存Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = VideoCacheModule.class)
public interface VideoCacheComponent {
    void inject(VideoCacheFragment fragment);
}
