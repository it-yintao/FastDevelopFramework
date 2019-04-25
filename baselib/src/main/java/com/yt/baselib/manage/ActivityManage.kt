package com.yt.baselib.manage

import android.app.Activity
import java.util.HashSet

/**
 * @author :created by yt
 * 时间:2019/4/21 4:09 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :管理所有的Activity
 */
class ActivityManage {

    private val allActivities = HashSet<Activity>()

    /**
     * 添加Activity到管理器
     */
     fun addActivity (activity:Activity){
        allActivities.add(activity)
    }

    /**
     * 从管理器移除Activity
     */

    fun removeActivity(activity: Activity){
        allActivities.remove(activity)
    }

    /**
     * 移除所有的Activity
     */
    fun finishAll(){
        for (activity in allActivities) {
            activity.finish()
        }
    }

}