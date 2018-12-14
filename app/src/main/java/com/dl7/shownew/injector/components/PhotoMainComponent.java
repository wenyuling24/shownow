package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.PhotoMainModule;
import com.dl7.shownew.module.photo.main.PhotoMainFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/20.
 * 图片 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = PhotoMainModule.class)
public interface PhotoMainComponent {
    void inject(PhotoMainFragment fragment);
}
