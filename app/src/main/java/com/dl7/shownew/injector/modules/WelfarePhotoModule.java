package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.WelfarePhotoAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.photo.welfare.WelfareListFragment;
import com.dl7.shownew.module.photo.welfare.WelfareListPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/10/11.
 * 福利图片界面 Module
 */
@Module
public class WelfarePhotoModule {

    private final WelfareListFragment mView;

    public WelfarePhotoModule(WelfareListFragment view) {
        this.mView = view;
    }

    @PerFragment
    @Provides
    public IBasePresenter providePresenter() {
        return new WelfareListPresenter(mView);
    }

    @PerFragment
    @Provides
    public BaseQuickAdapter provideAdapter() {
        return new WelfarePhotoAdapter(mView.getContext());
    }
}
