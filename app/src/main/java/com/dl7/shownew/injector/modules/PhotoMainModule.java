package com.dl7.shownew.injector.modules;


import com.dl7.shownew.adapter.ViewPagerAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.local.table.DaoSession;
import com.dl7.shownew.module.base.IRxBusPresenter;
import com.dl7.shownew.module.photo.main.PhotoMainFragment;
import com.dl7.shownew.module.photo.main.PhotoMainPresenter;
import com.dl7.shownew.rxbus.RxBus;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/12/20.
 * 图片主界面 Module
 */
@Module
public class PhotoMainModule {

    private final PhotoMainFragment mView;

    public PhotoMainModule(PhotoMainFragment view) {
        mView = view;
    }

    @PerFragment
    @Provides
    public ViewPagerAdapter provideViewPagerAdapter() {
        return new ViewPagerAdapter(mView.getChildFragmentManager());
    }

    @PerFragment
    @Provides
    public IRxBusPresenter providePhotosPresenter(DaoSession daoSession, RxBus rxBus) {
        return new PhotoMainPresenter(mView, daoSession.getBeautyPhotoInfoDao(), rxBus);
    }
}
