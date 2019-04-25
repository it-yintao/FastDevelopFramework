package com.yt.baselib.widget


import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.yt.baselib.R
import kotlinx.android.synthetic.main.custom_toolbar.view.*

/**
 * @author :created by yt
 * 时间:2019/4/24 10:35 AM
 * 邮箱:yintao_6666@126.com
 * @Describe :自定义Toolbar容器，在里面可以自行定义ToolBar样式
 */

//在Kotlin中@JvmOverloads注解的作用就是：在有默认参数值的方法中使用@JvmOverloads注解，则Kotlin就会暴露多个重载方法。

class CustomToolBar @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    RelativeLayout(context, attrs) {

    /**
     * 总布局
     */
    private var rootView: View? = null

    private var llToolBar: LinearLayout? = null
    /**
     * 得到左边的布局
     *
     * @return View
     */
    var llLeftView: LinearLayout? = null
        private set //表示能调用get方法，set方法私有
    /**
     * 得到中间的布局
     *
     * @return View
     */
    var llCenterView: LinearLayout? = null
        private set
    /**
     * 得到右边的布局
     *
     * @return View
     */
    var llRightView: LinearLayout? = null
        private set

    var center:TextView? = null
    var left : TextView? = null
    var right: TextView? = null
    /**
     * 字体颜色
     */
    private var leftTextColor = R.color.white
    private var centerTextColor = R.color.white
    private var rightTextColor = R.color.white

    /**
     * 字体大小
     */
    private var leftTextSize = 16
    private var centerTextSize = 16
    private var rightTextSize = 16


    init {
        initView(context)
    }


    fun setLeftTextColor(leftTextColor:Int):CustomToolBar{
        this.leftTextColor = leftTextSize
        return this
    }

    fun setCenterTextColor(centerTextColor:Int):CustomToolBar{
        this.centerTextColor = centerTextColor
        center?.setTextColor(centerTextColor)
        return this
    }

    fun setRightTextColor(rightTextColor: Int):CustomToolBar{
        this.rightTextColor = rightTextColor
        return this
    }

    fun setLeftTextSize(leftTextSize:Int):CustomToolBar{
        this.leftTextSize = leftTextSize
        return this
    }

    fun setCenterTextSize(centerTextSize:Int):CustomToolBar{
        this.centerTextSize = centerTextSize
        center?.textSize = centerTextSize.toFloat()
        return this
    }

    fun setRightTextSize(rightTextSize:Int):CustomToolBar{
        this.rightTextSize = rightTextSize
        return this
    }

    /**
     * 获取跟布局
     * @return
     */
    override fun getRootView(): View? {
        return rootView
    }


    /**
     * 初始化界面
     * @param context
     */
    private fun initView(context: Context) {
        rootView = View.inflate(context, R.layout.custom_toolbar, this)
        llToolBar = ll_toolbar
        llLeftView = ll_toolbar_left
        llCenterView = ll_toolbar_center
        llRightView = ll_toolbar_right
        showBackIcon(true)
    }

    /**
     * 设置左边图标
     * @param res 图片资源
     * @param listener 监听器
     */
    @JvmOverloads
     fun setLeftIcon(res: Int, listener:OnClickListener?=null):CustomToolBar {
        llLeftView?.let { 
            it.visibility = View.VISIBLE
            it.removeAllViews()
            val ivLeft = ImageView(context)
            ivLeft.setImageResource(res)
            it.addView(ivLeft)
            val llLeftViewNotNull = it
            listener?.let {
                llLeftViewNotNull.setOnClickListener(it)
            }

        }
        return this
    }

    /**
     * 设置中间图标
     * @param res 图片资源
     * @param listener 监听器
     */
    @JvmOverloads
    fun setCenterIcon(res: Int, listener: OnClickListener?=null):CustomToolBar {
        llCenterView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            val center = ImageView(context)
            center.setImageResource(res)
            val llCenterViewNotNull = it
            listener?.let { llCenterViewNotNull.setOnClickListener(it) }
        }
        return this
    }

    /**
     * 设置右边图标
     *
     * @param res 图片资源
     * @param listener   监听器
     */
    @JvmOverloads
    fun setRightIcon(res: Int, listener: OnClickListener?=null):CustomToolBar {
        llRightView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            val right = ImageView(context)
            right.setImageResource(res)
            val llRightViewNotNull = it
            listener?.let {
                llRightViewNotNull.setOnClickListener(it)
            }
        }
        return this
    }

    val textView: TextView
        get() {
            val tv = TextView(context)
            return tv
        }

    /**
     * 设置左边文字
     *
     * @param text 文字
     * @param listener    监听器
     */
    @JvmOverloads
    fun setLeftText(text: CharSequence, listener:OnClickListener? = null):CustomToolBar {
        llLeftView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            left = textView
            left?.text = text
            left?.setTextColor(ContextCompat.getColor(context,leftTextColor))
            left?.textSize = leftTextSize.toFloat()
            it.addView(left)
            val llLeftViewNotNull = it
            listener?.let {
                llLeftViewNotNull.setOnClickListener(it)
            }
        }
        return this
    }

    /**
     * 设置中间文字
     *
     * @param text 文字
     * @param listener    监听器
     */
    @JvmOverloads
    fun setCenterText(text: CharSequence, listener: OnClickListener? = null):CustomToolBar {

        llCenterView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            center = textView
            center?.text = text
            center?.setTextColor(ContextCompat.getColor(context,centerTextColor))
            center?.textSize = centerTextSize.toFloat()
            it.addView(center)
            val llCenterViewNotNull = it
            listener?.let {
                llCenterViewNotNull.setOnClickListener(it)
            }
        }
        return this
    }

    /**
     * 设置右边文字
     *
     * @param text 文字
     * @param l    监听器
     */
    @JvmOverloads
    fun setRightText(text: CharSequence, listener: OnClickListener? = null):CustomToolBar {

        llRightView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            right = textView
            right?.text = text
            right?.setTextColor(ContextCompat.getColor(context,rightTextColor))
            right?.textSize = rightTextSize.toFloat()
            it.addView(right)
            val llrightViewNotNull = it
            listener?.let {
                llrightViewNotNull.setOnClickListener(it)
            }
        }
        return this

    }

    /**
     * 设置左边布局
     *
     * @param v v
     */
    fun setllLeftView(v: View,listener: OnClickListener?=null):CustomToolBar {
        llLeftView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            it.addView(v)
        }
        listener?.let {
            v.setOnClickListener(it)
        }
        return this
    }

    /**
     * 设置中间布局
     *
     * @param v v
     */
    @JvmOverloads
    fun setllCenterView(v: View,listener: OnClickListener?=null):CustomToolBar {
        llCenterView?.let {
            it.visibility = View.VISIBLE
            it.removeAllViews()
            it.addView(v)
        }
        listener?.let {
            v.setOnClickListener(listener)
        }
        return this
    }

    /**
     * 设置右边布局
     */
    @JvmOverloads
    fun setllRightView(v: View, listener: OnClickListener? = null):CustomToolBar {
        llRightView?.let {
            it.removeAllViews()
            it.addView(v)
        }
        listener?.let {
            v.setOnClickListener(listener)
        }

        return this
    }



    /**
     * 替换整个ToolBar
     * @param v
     */
    fun setToolBarView(v: View) :CustomToolBar{
        llToolBar?.let {
            it.removeAllViews()
            it.addView(v)
        }
        return this
    }

    /**
     * 默认显示左边的按钮
     * @param show
     */
    fun showBackIcon(show: Boolean) {
        if (show) {
            setLeftIcon(R.mipmap.ic_back, OnClickListener { v ->
                val ctx = this@CustomToolBar.context
                if (ctx is Activity) {
                    ctx.onBackPressed()
                }
            })
        } else {
            llLeftView?.let { 
                it.visibility = View.INVISIBLE
            }
        }
    }

}

