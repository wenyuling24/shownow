package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.ChannelModule;
import com.dl7.shownew.module.news.channel.ChannelActivity;
import dagger.Component;

/**
 * Created by long on 2016/8/31.
 * 管理 Component
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ChannelModule.class)
public interface ManageComponent {
    void inject(ChannelActivity activity);
}
