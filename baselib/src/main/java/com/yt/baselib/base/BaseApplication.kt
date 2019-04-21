package com.yt.baselib.base

import android.app.Application
import android.content.Context
import com.yt.baselib.ActivityManage

/**
 * @author :created by yt
 * 时间:2019/4/21 7:40 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :基础Application所有需要模块化开发的module都需要继承BaseApplication
 */
class BaseApplication : Application() {
    private var activityManage:ActivityManage? = null

    companion object {

        private lateinit var  application:BaseApplication
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

    }

    override fun onCreate() {
        super.onCreate()

        activityManage = ActivityManage()
    }

    /**
     * 程序终止的时候运行
     */
    override fun onTerminate() {
        super.onTerminate()
        exitApp()
    }

    /**
     * 退出应用
     */
    private fun exitApp(){
        activityManage?.finishAll()
        android.os.Process.killProcess(android.os.Process.myPid())
        System.exit(0)
    }
}