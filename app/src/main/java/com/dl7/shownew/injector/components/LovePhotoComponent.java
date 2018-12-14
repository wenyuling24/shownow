package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.LovePhotoModule;
import com.dl7.shownew.module.manage.love.photo.LovePhotoFragment;
import dagger.Component;

/**
 * Created by long on 2016/12/13.
 * 图片收藏界面 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = LovePhotoModule.class)
public interface LovePhotoComponent {
    void inject(LovePhotoFragment fragment);
}
