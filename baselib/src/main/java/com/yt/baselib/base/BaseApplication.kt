package com.yt.baselib.base

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.ActivityManage
import com.yt.baselib.BuildConfig

/**
 * @author :created by yt
 * 时间:2019/4/21 7:40 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :基础Application所有需要模块化开发的module都需要继承BaseApplication
 */
open class BaseApplication : Application() {


    companion object {

        private lateinit var  application:BaseApplication
        private lateinit var activityManage: ActivityManage
        /**
         * 获取全局唯一上下文
         */
        fun getApplication(): BaseApplication {
            return application
        }
    }



    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        application = this
        //MultiDex分包方法，必须最先初始化
        MultiDex.install(this)

    }

    override fun onCreate() {
        super.onCreate()
        initARouter()
        activityManage = ActivityManage()
    }

    fun getActivityManage():ActivityManage{
            return activityManage
    }

    /**
     * 程序终止的时候运行
     */
    override fun onTerminate() {
        super.onTerminate()
        exitApp()
    }


    private fun initARouter(){
        if (BuildConfig.DEBUG){
            ARouter.openDebug() //打印日志
            ARouter.openDebug() //开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application)//尽可能早，推荐在Application中初始化
    }
    /**
     * 退出应用
     */
    private fun exitApp(){
        activityManage.finishAll()
        android.os.Process.killProcess(android.os.Process.myPid())
        System.exit(0)
    }
}