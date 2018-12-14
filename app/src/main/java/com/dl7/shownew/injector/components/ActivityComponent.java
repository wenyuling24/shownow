package com.dl7.shownew.injector.components;

import android.app.Activity;

import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.ActivityModule;
import dagger.Component;

/**
 * Created by long on 2016/8/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();
}
