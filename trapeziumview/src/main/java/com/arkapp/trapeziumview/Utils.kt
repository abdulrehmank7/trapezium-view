package com.arkapp.trapeziumview

import android.content.Context
import android.util.TypedValue


/**
 * Created by Abdul Rehman on 28-11-2020.
 * Contact email - abdulrehman0796@gmail.com
 */

fun dpToPx(dp: Float, context: Context) = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,
    dp,
    context.resources.displayMetrics
)
