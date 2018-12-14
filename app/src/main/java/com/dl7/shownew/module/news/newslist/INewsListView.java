package com.dl7.shownew.module.news.newslist;


import com.dl7.shownew.adapter.item.NewsMultiItem;
import com.dl7.shownew.api.bean.NewsInfo;
import com.dl7.shownew.module.base.ILoadDataView;
import java.util.List;

/**
 * Created by long on 2016/8/23.
 * 新闻列表视图接口
 */
public interface INewsListView extends ILoadDataView<List<NewsMultiItem>> {

    /**
     * 加载广告数据
     * @param newsBean 新闻
     */
    void loadAdData(NewsInfo newsBean);
}
