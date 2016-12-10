package me.bakumon.gank.module.category;

import me.bakumon.gank.base.BasePresenter;
import me.bakumon.gank.base.BaseView;
import me.bakumon.gank.entity.AndroidResult;

/**
 * CategoryContract
 * Created by bakumon on 2016/12/8.
 */
public interface CategoryContract {

    interface View extends BaseView {

        void setAndroidItems(AndroidResult androidResult);

        void addAndroidItems(AndroidResult androidResult);

        void getAndroidItemsFail(String failMessage);
    }

    interface Presenter extends BasePresenter {

        void getAndroidItems(int number, int page, boolean isRefresh);
    }
}