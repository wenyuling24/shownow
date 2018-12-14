package com.dl7.shownew.injector.modules;

import com.dl7.recycler.adapter.BaseQuickAdapter;

import com.dl7.shownew.adapter.VideoListAdapter;
import com.dl7.shownew.injector.PerFragment;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.video.list.VideoListFragment;
import com.dl7.shownew.module.video.list.VideoListPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/10/11.
 * video列表
 */
@Module
public class VideoListModule {

    private final VideoListFragment mView;
    private final String mVideoId;

    public VideoListModule(VideoListFragment view, String videoId) {
        this.mView = view;
        this.mVideoId = videoId;
    }

    @PerFragment
    @Provides
    public IBasePresenter providePresenter() {
        return new VideoListPresenter(mView, mVideoId);
    }

    @PerFragment
    @Provides
    public BaseQuickAdapter provideAdapter() {
        return new VideoListAdapter(mView.getContext());
    }
}
