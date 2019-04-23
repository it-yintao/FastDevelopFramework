package com.yt.message

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.constants.RouterConstance
import kotlinx.android.synthetic.main.message_activity_main.*

@Route(path = RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
class MsgMainActivity : AppCompatActivity(),View.OnClickListener {
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_activity_main)
        ARouter.getInstance().inject(this)
        bt_message_to_contacts.setOnClickListener(this)
        bt_message_to_found.setOnClickListener(this)
        bt_message_to_main.setOnClickListener(this)
        bt_message_to_mine.setOnClickListener(this)
    }
}
