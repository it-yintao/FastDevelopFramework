package com.yt.contacts.view



import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouteConstance
import com.yt.contacts.R
import kotlinx.android.synthetic.main.contacts_activity_enter.*

@Route(path = RouteConstance.CONTACTS_ACTIVITY_URL_MAIN)
class ContactsEnterActivity :BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.contacts_activity_enter
    }

    override fun initView() {
    }

    override fun onClick(v: View?) {

    }


}
