package com.yt.baselib.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.alibaba.android.arouter.launcher.ARouter
import com.gyf.barlibrary.ImmersionBar

/**
 * @author :created by yt
 * 时间:2019/4/23 8:33 PM
 * 邮箱:yintao_6666@126.com
 * @Describe : 包含各种基类Activity
 */

abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var mContext: Context
    protected var mImmersionBar:ImmersionBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        //将Activity加入管理器
        BaseApplication.getApplication().getActivityManage().addActivity(this)

        if (isHideStatusBar()){
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }

        setContentView(getLayoutId())
        //初始化ARouter
        ARouter.getInstance().inject(this)
    }



        //研究这个方法运行的上面时候
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
            initToolBar()
            initView()
            initData()
    }

    override fun onDestroy() {
        super.onDestroy()

        //必须调用该方法，防止内存泄露
        mImmersionBar?.destroy()
        //将Activity从管理器移除
        BaseApplication.getApplication().getActivityManage().removeActivity(this)
    }


    /**
     * 如果不显示状态栏的activity true
     * 显示 不重写该方法，默认是显示的
     */
    protected fun isHideStatusBar(): Boolean{
        return false
    }

    /**
     * 初始化toolbar，需要设置方法重写
     */
    protected fun initToolBar(){

    }

    /**
     * 初始化数据，需要则重写改方法
     */
    protected fun initData(){

    }

    /**
     * 设置沉浸式状态栏，如需重写，请在initView()调用
     */
    protected fun initImmersionBar(color: Int){
        mImmersionBar = ImmersionBar.with(this)
        mImmersionBar?.statusBarColor(color)
//        mImmersionBar?.init() //调用这个方法状态栏的字体颜色不会发生改变
        mImmersionBar?.autoStatusBarDarkModeEnable(true, 0.2f)?.init()
    }

    //获取布局文件
    abstract fun getLayoutId():Int

    //初始化view
    abstract fun initView()

}