package com.yt.found.view

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouteConstance
import com.yt.found.R
import kotlinx.android.synthetic.main.found_activity_enter.*

@Route(path =  RouteConstance.FOUND_ACTIVITY_URL_MAIN)
class FoundEnterActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.found_activity_enter
    }

    override fun initView() {

    }

    override fun onClick(v: View?) {

    }


}
