package com.yt.mine.view


import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouteConstance
import com.yt.mine.R
import kotlinx.android.synthetic.main.mine_activity_enter.*


@Route(path = RouteConstance.MINE_ACTIVITY_URL_MAIN)
class MineEnterActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.mine_activity_enter
    }

    override fun initView() {
    }

    override fun onClick(v: View?) {


    }


}
