package com.dl7.shownew.injector.components;


import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.PhotoSetModule;
import com.dl7.shownew.module.news.photoset.PhotoSetActivity;
import dagger.Component;

/**
 * Created by long on 2016/8/29.
 * 图集 Component
 */
@PerActivity
@Component(modules = PhotoSetModule.class)
public interface PhotoSetComponent {
    void inject(PhotoSetActivity activity);
}
