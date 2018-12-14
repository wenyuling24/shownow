package com.dl7.shownew.injector.modules;

import android.app.Activity;

import com.dl7.shownew.injector.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/8/19.
 * Activity Module
 */
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @PerActivity
    @Provides
    Activity getActivity() {
        return mActivity;
    }
}
