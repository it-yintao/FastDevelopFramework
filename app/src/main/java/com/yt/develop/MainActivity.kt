package com.yt.develop


import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouterConstance


import kotlinx.android.synthetic.main.activity_main.*


@Route(path = RouterConstance.APP_ACTIVITY_URL_MAIN)
class MainActivity : BaseActivity(),View.OnClickListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        bt_to_contacts.setOnClickListener(this)
        bt_to_found.setOnClickListener(this)
        bt_to_message.setOnClickListener(this)
        bt_to_mine.setOnClickListener(this)
        initImmersionBar(R.color.white)
        ctb_main
            .setCenterText("主界面")
            .setCenterTextColor(R.color.red)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_to_contacts ->  {
                ARouterUtil.startActivity(RouterConstance.CONTACTS_ACTIVITY_URL_MAIN)
            }

            R.id.bt_to_found ->{
                ARouterUtil.startActivity(RouterConstance.FOUND_ACTIVITY_URL_MAIN)
            }
            R.id.bt_to_message -> {
                ARouterUtil.startActivity(RouterConstance.MESSAGE_ACTIVITY_URL_MAIN)
            }
            R.id.bt_to_mine -> {
                ARouterUtil.startActivity(RouterConstance.MINE_ACTIVITY_URL_MAIN)
            }
        }
    }

}
