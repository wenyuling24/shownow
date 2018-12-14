package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.PhotoListAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.photo.news.PhotoNewsFragment;
import com.dl7.shownew.module.photo.news.PhotoNewsPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/9/5.
 * 图片新闻列表 Module
 */
@Module
public class PhotoNewsModule {

    private final PhotoNewsFragment mView;

    public PhotoNewsModule(PhotoNewsFragment view) {
        this.mView = view;
    }

    @PerFragment
    @Provides
    public IBasePresenter providePresenter() {
        return new PhotoNewsPresenter(mView);
    }

    @PerFragment
    @Provides
    public BaseQuickAdapter provideAdapter() {
        return new PhotoListAdapter(mView.getContext());
    }
}
