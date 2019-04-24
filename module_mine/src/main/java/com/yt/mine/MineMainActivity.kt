package com.yt.mine


import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouterConstance
import kotlinx.android.synthetic.main.mine_activity_main.*


@Route(path = RouterConstance.MINE_ACTIVITY_URL_MAIN)
class MineMainActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.mine_activity_main
    }

    override fun initView() {
        bt_mine_to_contacts.setOnClickListener(this)
        bt_mine_to_found.setOnClickListener(this)
        bt_mine_to_main.setOnClickListener(this)
        bt_mine_to_msg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_mine_to_contacts->{
                ARouterUtil.startActivity(RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
            }
            R.id.bt_mine_to_found -> {
                ARouterUtil.startActivity(RouterConstance.FOUND_ACTIVITY_URL_MAIN)
            }
            R.id.bt_mine_to_main -> {
                ARouterUtil.startActivity(RouterConstance.APP_ACTIVITY_URL_MAIN)
            }
            R.id.bt_mine_to_msg -> {
                ARouterUtil.startActivity(RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
            }
        }
    }


}
