package com.yt.message.view

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouteConstance
import com.yt.message.R
import kotlinx.android.synthetic.main.message_activity_enter.*

@Route(path = RouteConstance.MESSAGE_ACTIVITY_URL_MAIN)
class MsgEnterActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.message_activity_enter
    }

    override fun initView() {

    }

    override fun onClick(v: View?) {

    }

}
