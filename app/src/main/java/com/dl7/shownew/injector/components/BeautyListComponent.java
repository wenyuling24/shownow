package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.injector.modules.BeautyListModule;
import com.dl7.shownew.module.photo.beauty.BeautyListFragment;
import dagger.Component;

/**
 * Created by long on 2016/9/5.
 * 美图 PerFragment
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = BeautyListModule.class)
public interface BeautyListComponent {
    void inject(BeautyListFragment fragment);
}
