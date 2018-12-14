package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.BigPhotoModule;
import com.dl7.shownew.module.photo.bigphoto.BigPhotoActivity;
import dagger.Component;

/**
 * Created by long on 2016/9/27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = BigPhotoModule.class)
public interface BigPhotoComponent {
    void inject(BigPhotoActivity activity);
}
