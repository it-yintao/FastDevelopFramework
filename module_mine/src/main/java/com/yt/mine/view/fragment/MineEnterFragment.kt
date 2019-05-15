package com.yt.mine.view.fragment

import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseFragment
import com.yt.baselib.constants.RouteConstance
import com.yt.mine.R

/**
 * @author :created by yt
 * 时间:2019/5/14 10:41 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :
 */
@Route(path = RouteConstance.MINE_FRAGMENT_URL_ENTER)
class MineEnterFragment :BaseFragment() {
    override fun initView() {

    }

    override fun getLayoutId(): Int {
        return R.layout.mine_fragment_enter
    }
}