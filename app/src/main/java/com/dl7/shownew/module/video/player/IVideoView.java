package com.dl7.shownew.module.video.player;

import com.dl7.shownew.local.table.VideoInfo;
import com.dl7.shownew.module.base.IBaseView;
import java.io.InputStream;

/**
 * Created by long on 2016/12/23.
 * Video接口
 */
public interface IVideoView extends IBaseView {

    /**
     * 获取Video数据
     * @param data 数据
     */
    void loadData(VideoInfo data);

    /**
     * 获取弹幕数据
     * @param inputStream 数据
     */
    void loadDanmakuData(InputStream inputStream);

}
