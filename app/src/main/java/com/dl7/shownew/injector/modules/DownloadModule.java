package com.dl7.shownew.injector.modules;


import com.dl7.shownew.adapter.ViewPagerAdapter;
import com.dl7.shownew.injector.PerActivity;
import com.dl7.shownew.module.base.IRxBusPresenter;
import com.dl7.shownew.module.manage.download.DownloadActivity;
import com.dl7.shownew.module.manage.download.DownloadPresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/19.
 * video下载Module
 */
@Module
public class DownloadModule {

    private final DownloadActivity mView;

    public DownloadModule(DownloadActivity view) {
        mView = view;
    }

    @PerActivity
    @Provides
    public ViewPagerAdapter provideViewPagerAdapter() {
        return new ViewPagerAdapter(mView.getSupportFragmentManager());
    }

    @PerActivity
    @Provides
    public IRxBusPresenter provideVideosPresenter(RxBus rxBus) {
        return new DownloadPresenter(rxBus);
    }
}
