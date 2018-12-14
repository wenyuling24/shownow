package com.dl7.shownew.module.video.player;

import com.dl7.shownew.local.table.DanmakuInfo;
import com.dl7.shownew.local.table.VideoInfo;
import com.dl7.shownew.module.base.ILocalPresenter;

/**
 * Created by long on 2016/12/23.
 * Video Presenter
 */
public interface IVideoPresenter extends ILocalPresenter<VideoInfo> {

    /**
     * 添加一条弹幕到数据库
     * @param danmakuInfo
     */
    void addDanmaku(DanmakuInfo danmakuInfo);

    /**
     * 清空该视频所有缓存弹幕
     */
    void cleanDanmaku();
}
