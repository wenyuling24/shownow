package com.dl7.shownew.adapter;

import android.content.Context;
import android.widget.ImageView;
import com.dl7.recycler.adapter.BaseQuickAdapter;
import com.dl7.recycler.adapter.BaseViewHolder;
import com.dl7.shownew.R;
import com.dl7.shownew.local.table.VideoInfo;
import com.dl7.shownew.utils.DefIconFactory;
import com.dl7.shownew.utils.ImageLoader;

/**
 * Created by long on 2016/12/13.
 * Video收藏适配器
 */
public class VideoLoveAdapter extends BaseQuickAdapter<VideoInfo> {

    public VideoLoveAdapter(Context context) {
        super(context);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.adapter_video_love;
    }

    @Override
    protected void convert(BaseViewHolder holder, final VideoInfo item) {
        ImageView ivThumb = holder.getView(R.id.iv_thumb);
        ImageLoader.loadFitCenter(mContext, item.getCover(), ivThumb, DefIconFactory.provideIcon());
        holder.setText(R.id.tv_title, item.getTitle())
                .setText(R.id.tv_desc, item.getSectiontitle());
    }
}
