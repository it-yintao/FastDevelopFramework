package com.yt.develop.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * @author :created by yt
 * 时间:2019/5/14 9:20 PM
 * 邮箱:yintao_6666@126.com
 * @Describe : pagerAdapter
 */
class HomeFragmentPagerAdapter(fm: FragmentManager, private val list: List<Fragment>) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }

}
