package com.yt.develop



import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.alibaba.android.arouter.facade.annotation.Route
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.constants.RouteConstance
import com.yt.develop.adapter.HomeFragmentPagerAdapter


import kotlinx.android.synthetic.main.activity_main.*


@Route(path = RouteConstance.APP_ACTIVITY_URL_MAIN)
class MainActivity : BaseActivity(){
    private lateinit var homeFragmentPagerAdapter:HomeFragmentPagerAdapter
    private val fragmentList :MutableList<Fragment> = ArrayList()
    init {
     //消息
    val msgFragment = ARouterUtil.getFragment(RouteConstance.MESSAGE_FRAGMENT_URL_ENTER)
    //通讯录
    val conFragment = ARouterUtil.getFragment(RouteConstance.CONTACTS_FRAGMENT_URL_ENTER)
    //发现模块
    val foundFragment = ARouterUtil.getFragment(RouteConstance.FOUND_FRAGMENT_URL_ENTER)
    //用户某块
    val userFragment = ARouterUtil.getFragment(RouteConstance.MINE_FRAGMENT_URL_ENTER)
        fragmentList.add(0,msgFragment)
        fragmentList.add(1,conFragment)
        fragmentList.add(2,foundFragment)
        fragmentList.add(3,userFragment)

    }
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        initImmersionBar(R.color.white)
        ctb_main.setCenterText("主界面")
            .setCenterTextColor(R.color.red)
        src_main.check(R.id.rb_msg)
        src_main.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.rb_msg ->{
                vp_main.currentItem = 0
                }
                R.id.rb_cont ->{
                vp_main.currentItem = 1
                }
                R.id.rb_found->{
                    vp_main.currentItem = 2
                }
                R.id.rb_user->{
                    vp_main.currentItem = 3
                }
            }


        }

        homeFragmentPagerAdapter = HomeFragmentPagerAdapter(supportFragmentManager,fragmentList)

        vp_main.adapter = homeFragmentPagerAdapter

        vp_main.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> src_main.check(R.id.rb_msg)
                    1 -> src_main.check(R.id.rb_cont)
                    2 -> src_main.check(R.id.rb_found)
                    3 -> src_main.check(R.id.rb_user)
                    else -> {
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

}
