package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.WelfarePhotoModule;
import com.dl7.shownew.module.photo.welfare.WelfareListFragment;
import dagger.Component;

/**
 * Created by long on 2016/10/11.
 * 福利图片界面 Component
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = WelfarePhotoModule.class)
public interface WelfarePhotoComponent {
    void inject(WelfareListFragment fragment);
}
