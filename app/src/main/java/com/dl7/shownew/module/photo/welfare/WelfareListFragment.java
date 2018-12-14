package com.dl7.shownew.module.photo.welfare;

import android.support.v7.widget.RecyclerView;
import com.dl7.recycler.adapter.BaseQuickAdapter;
import com.dl7.recycler.helper.RecyclerViewHelper;
import com.dl7.recycler.listener.OnRequestDataListener;

import com.dl7.shownew.R;
import com.dl7.shownew.adapter.SlideInBottomAdapter;
import com.dl7.shownew.api.bean.WelfarePhotoInfo;
import com.dl7.shownew.injector.components.DaggerWelfarePhotoComponent;
import com.dl7.shownew.injector.modules.WelfarePhotoModule;
import com.dl7.shownew.module.base.BaseFragment;
import com.dl7.shownew.module.base.IBasePresenter;
import com.dl7.shownew.module.base.ILoadDataView;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by long on 2016/10/11.
 * 福利图片界面
 */
public class WelfareListFragment extends BaseFragment<IBasePresenter>
    implements ILoadDataView<List<WelfarePhotoInfo>> {

    @BindView(R.id.rv_photo_list)
    RecyclerView mRvPhotoList;

    @Inject
    BaseQuickAdapter mAdapter;


    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_photo_list;
    }

    @Override
    protected void initInjector() {
        DaggerWelfarePhotoComponent.builder()
                .applicationComponent(getAppComponent())
                .welfarePhotoModule(new WelfarePhotoModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void initViews() {
        SlideInBottomAdapter slideAdapter = new SlideInBottomAdapter(mAdapter);
        RecyclerViewHelper.initRecyclerViewSV(mContext, mRvPhotoList, slideAdapter, 2);
        mAdapter.setRequestDataListener(new OnRequestDataListener() {
            @Override
            public void onLoadMore() {
                mPresenter.getMoreData();
            }
        });
    }

    @Override
    protected void updateViews(boolean isRefresh) {
        mPresenter.getData(isRefresh);
    }

    @Override
    public void loadData(List<WelfarePhotoInfo> photoList) {
        mAdapter.updateItems(photoList);
    }

    @Override
    public void loadMoreData(List<WelfarePhotoInfo> photoList) {
        mAdapter.loadComplete();
        mAdapter.addItems(photoList);
    }

    @Override
    public void loadNoData() {
        mAdapter.loadAbnormal();
    }
}