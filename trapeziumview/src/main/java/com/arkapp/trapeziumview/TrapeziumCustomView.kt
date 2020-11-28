package com.arkapp.trapeziumview

import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi

/**
 * Created by Abdul Rehman on 11/28/2020.
 */
class TrapeziumCustomView : View {

    var mPaint: Paint? = null
    var path: Path? = null
    var mSquareColor = 0
    private var slopeLength = 0f
    private var radius = 0f
    private var corEffect: CornerPathEffect? = null

    private val topRight = 0
    private val topLeft = 1
    private val bottomRight = 2
    private val bottomLeft = 3
    private val leftTop = 4
    private val leftBottom = 5
    private val rightTop = 6
    private val rightBottom = 7

    private var slopeType: Int = bottomRight

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context?, attrs: AttributeSet?, defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(attrs)
    }

    private fun init(set: AttributeSet?) {
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        path = Path()
        val a = context.theme.obtainStyledAttributes(set, R.styleable.TrapeziumView, 0, 0)
        try {
            mSquareColor = a.getColor(R.styleable.TrapeziumView_shapeColor, Color.RED)
            radius = dpToPx(a.getFloat(R.styleable.TrapeziumView_edgeRadius, 8f), context)
            slopeLength = dpToPx(a.getFloat(R.styleable.TrapeziumView_slopeLength, 58f), context)
            slopeType = a.getInt(R.styleable.TrapeziumView_slopeType, bottomRight)

        } finally {
            a.recycle()
        }
        corEffect = CornerPathEffect(radius)
        mPaint!!.color = mSquareColor
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val W = width.toFloat()
        val H = height.toFloat()
        mPaint!!.pathEffect = corEffect
        when (slopeType) {
            topRight -> {
                path!!.moveTo(0f, slopeLength)
                path!!.lineTo(0f, H)
                path!!.lineTo(W, H)
                path!!.lineTo(W, 0f)
            }
            topLeft -> {
                path!!.moveTo(0f, 0f)
                path!!.lineTo(W, slopeLength)
                path!!.lineTo(W, H)
                path!!.lineTo(0f, H)
            }
            bottomRight -> {
                path!!.moveTo(0f, (H - slopeLength.toInt()))
                path!!.lineTo(W, H)
                path!!.lineTo(W, 0f)
                path!!.lineTo(0f, 0f)
            }
            bottomLeft -> {
                path!!.moveTo(0f, 0f)
                path!!.lineTo(0f, H)
                path!!.lineTo(W, H - slopeLength)
                path!!.lineTo(W, 0f)
            }
            rightTop -> {
                path!!.moveTo(0f, 0f)
                path!!.lineTo(W, 0f)
                path!!.lineTo(W - slopeLength, H)
                path!!.lineTo(0f, H)
            }

            rightBottom -> {
                path!!.moveTo(0f, 0f)
                path!!.lineTo(W - slopeLength, 0f)
                path!!.lineTo(W, H)
                path!!.lineTo(0f, H)
            }

            leftTop -> {
                path!!.moveTo(0f, 0f)
                path!!.lineTo(slopeLength, H)
                path!!.lineTo(W, H)
                path!!.lineTo(W, 0f)
            }

            leftBottom -> {
                path!!.moveTo(0f, H)
                path!!.lineTo(W, H)
                path!!.lineTo(W, 0f)
                path!!.lineTo(slopeLength, 0f)
            }
        }
        path!!.close()
        canvas.drawPath(path!!, mPaint!!)
    }
}