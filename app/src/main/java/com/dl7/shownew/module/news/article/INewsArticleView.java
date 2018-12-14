package com.dl7.shownew.module.news.article;

import com.dl7.shownew.api.bean.NewsDetailInfo;
import com.dl7.shownew.module.base.IBaseView;

/**
 * Created by long on 2017/2/3.
 * 新闻详情接口
 */
public interface INewsArticleView extends IBaseView {

    /**
     * 显示数据
     * @param newsDetailBean 新闻详情
     */
    void loadData(NewsDetailInfo newsDetailBean);
}


