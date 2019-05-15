import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter
import com.yt.baselib.base.BaseActivity
import com.yt.baselib.base.BaseFragment

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

    /**
     * 根据path返回Fragment
     * @param path
     */
    fun getFragment(path: String):BaseFragment{
        return ARouter.getInstance().build(path).navigation() as BaseFragment
    }

    /**
     * 根据path返回Activity
     */
    fun getActivity(path: String):BaseActivity{
        return ARouter.getInstance().build(path).navigation() as BaseActivity
    }

}
