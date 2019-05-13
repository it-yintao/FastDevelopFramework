package com.yt.message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouterConstance
import kotlinx.android.synthetic.main.message_activity_main.*

@Route(path = RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
class MsgMainActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.message_activity_main
    }

    override fun initView() {
        bt_message_to_contacts.setOnClickListener(this)
        bt_message_to_found.setOnClickListener(this)
        bt_message_to_main.setOnClickListener(this)
        bt_message_to_mine.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_message_to_contacts->{
                ARouterUtil.startActivity(RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
            }
            R.id.bt_message_to_found->{
                ARouterUtil.startActivity(RouterConstance.FOUND_ACTIVITY_URL_MAIN)
            }
            R.id.bt_message_to_main->{
                ARouterUtil.startActivity(RouterConstance.APP_ACTIVITY_URL_MAIN)
            }
            R.id.bt_message_to_mine->{
                ARouterUtil.startActivity(RouterConstance.MINE_ACTIVITY_URL_MAIN)
            }
        }
    }

}
