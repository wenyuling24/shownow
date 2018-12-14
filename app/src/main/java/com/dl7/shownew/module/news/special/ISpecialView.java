package com.dl7.shownew.module.news.special;


import com.dl7.shownew.adapter.item.SpecialItem;
import com.dl7.shownew.api.bean.SpecialInfo;
import com.dl7.shownew.module.base.IBaseView;
import java.util.List;

/**
 * Created by long on 2016/8/26.
 * 专题View接口
 */
public interface ISpecialView extends IBaseView {

    /**
     * 显示数据
     * @param specialItems 新闻
     */
    void loadData(List<SpecialItem> specialItems);

    /**
     * 添加头部
     * @param specialBean
     */
    void loadBanner(SpecialInfo specialBean);
}
