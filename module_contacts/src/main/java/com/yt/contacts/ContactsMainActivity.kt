package com.yt.contacts



import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouterConstance
import kotlinx.android.synthetic.main.contacts_activity_main.*

@Route(path = RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
class ContactsMainActivity :BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.contacts_activity_main
    }

    override fun initView() {
        bt_contacts_to_main.setOnClickListener(this)
        bt_contacts_to_found.setOnClickListener(this)
        bt_contacts_to_mine.setOnClickListener(this)
        bt_contacts_to_msg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_contacts_to_main ->{
                ARouterUtil.startActivity(RouterConstance.APP_ACTIVITY_URL_MAIN)
            }
            R.id.bt_contacts_to_found->{
                ARouterUtil.startActivity(RouterConstance.FOUND_ACTIVITY_URL_MAIN)
            }
            R.id.bt_contacts_to_mine->{
                ARouterUtil.startActivity(RouterConstance.MINE_ACTIVITY_URL_MAIN)
            }
            R.id.bt_contacts_to_msg ->{
                ARouterUtil.startActivity(RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
            }

        }
    }


}
