package com.yt.found

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouterConstance
import kotlinx.android.synthetic.main.found_activity_main.*

@Route(path =  RouterConstance.FOUND_ACTIVITY_URL_MAIN)
class FoundMainActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.found_activity_main
    }

    override fun initView() {
        bt_found_to_contacts.setOnClickListener(this)
        bt_found_to_main.setOnClickListener(this)
        bt_found_to_mine.setOnClickListener(this)
        bt_found_to_msg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_found_to_contacts->{
                ARouterUtil.startActivity(RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
            }
            R.id.bt_found_to_main ->{
                ARouterUtil.startActivity(RouterConstance.APP_ACTIVITY_URL_MAIN)
            }
            R.id.bt_found_to_mine ->{
                ARouterUtil.startActivity(RouterConstance.MINE_ACTIVITY_URL_MAIN)
            }
            R.id.bt_found_to_msg ->{
                ARouterUtil.startActivity(RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
            }
        }
    }


}
