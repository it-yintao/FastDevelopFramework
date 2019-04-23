import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author :created by yt
 * 时间:2019/4/22 10:14 PM
 * 邮箱:yintao_6666@126.com
 * @Describe :
 */
object ARouterUtil {

//    companion object {
        fun startActivity(path:String){
            ARouter.getInstance().build(path).navigation()
        }
//    }


}
