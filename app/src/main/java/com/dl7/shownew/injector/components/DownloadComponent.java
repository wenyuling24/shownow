package com.dl7.shownew.injector.components;

import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.injector.modules.DownloadModule;
import com.dl7.shownew.module.manage.download.DownloadActivity;
import dagger.Component;

/**
 * Created by long on 2016/12/19.
 * video下载 Component
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = DownloadModule.class)
public interface DownloadComponent {
    void inject(DownloadActivity activity);
}
