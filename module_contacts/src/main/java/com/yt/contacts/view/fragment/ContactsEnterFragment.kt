package com.yt.contacts.view.fragment

import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseFragment
import com.yt.baselib.constants.RouteConstance
import com.yt.contacts.R

/**
 * @author :created by yt
 * 时间:2019/5/14 10:24 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :
 */

@Route(path = RouteConstance.CONTACTS_FRAGMENT_URL_ENTER)
class ContactsEnterFragment :BaseFragment(){
    override fun getLayoutId(): Int {
        return R.layout.contacts_fragment_enter
    }

    override fun initView() {

    }
}