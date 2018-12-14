package com.dl7.shownew.adapter.item;

import com.dl7.recycler.entity.SectionEntity;
import com.dl7.shownew.api.bean.NewsItemInfo;

/**
 * Created by long on 2016/8/26.
 * 专题列表项
 */
public class SpecialItem extends SectionEntity<NewsItemInfo> {

    public SpecialItem(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public SpecialItem(NewsItemInfo newsItemBean) {
        super(newsItemBean);
    }
}
