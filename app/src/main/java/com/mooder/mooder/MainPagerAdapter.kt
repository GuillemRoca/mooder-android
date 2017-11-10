package com.mooder.mooder

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by guillemroca on 9/11/17.
 * Copyright © 2017 Badi. All rights reserved.
 */

class MainPagerAdapter(fm: FragmentManager, context: Context) : FragmentPagerAdapter(fm) {
    private val tabTitles: Array<String>

    init {
        tabTitles = context.resources.getStringArray(R.array.main_options)
    }

    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getItem(position: Int): Fragment {
        var currentFragment = Fragment()
        when (position) {
            DASHBOARD_FRAGMENT_POSITION -> currentFragment = DashboardFragment.newInstance()
            PLAYGROUND_FRAGMENT_POSITION -> currentFragment = PlaygroundFragment.newInstance()
        }
        return currentFragment
    }

    override fun getPageTitle(position: Int): CharSequence {
        // Generate title based on item position
        return tabTitles[position]
    }

    companion object {
        val DASHBOARD_FRAGMENT_POSITION = 0
        val PLAYGROUND_FRAGMENT_POSITION = 1
    }

}
