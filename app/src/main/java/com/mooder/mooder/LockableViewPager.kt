package com.mooder.mooder

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * The [LockableViewPager] is an extension of the [ViewPager] with overwrite controls to avoid user swipe behaviour.
 * By default the Lockable viewpager behaviour is locked (swipeLocked = true).
 */

class LockableViewPager : ViewPager {

    var swipeLocked = true

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return !swipeLocked && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return !swipeLocked && super.onInterceptTouchEvent(event)
    }

    override fun canScrollHorizontally(direction: Int): Boolean {
        return !swipeLocked && super.canScrollHorizontally(direction)
    }

}
