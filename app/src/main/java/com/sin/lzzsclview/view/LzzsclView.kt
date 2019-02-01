package com.sin.lzzsclview.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by sin on 2019/2/1.
 */

class LzzsclView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : View(context, attrs, defStyleAttr) {

    private var paint: Paint? = null

    init {
        init()
    }

    private fun init() {
        paint = Paint()
        paint!!.color = Color.RED
        paint!!.isAntiAlias = true // 防锯齿
        paint!!.isDither = true //防抖动
        paint!!.textSize = 100f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val str = "test"
        canvas.drawText(str, (width / 2).toFloat(), (height / 2).toFloat(), paint!!)
    }

    companion object {

        private val TAG = LzzsclView::class.java!!.getSimpleName()

        private val LOG = true
    }
}
