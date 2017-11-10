package com.mooder.mooder

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager

class MainActivity : AppCompatActivity() {

    private var mainViewPager: LockableViewPager? = null
    private var navigation: BottomNavigationView? = null
    private var inputMethodManager: InputMethodManager? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_dashboard -> {
                supportActionBar!!.title = getString(R.string.title_dashboard)
                showFragment(MainPagerAdapter.DASHBOARD_FRAGMENT_POSITION)
                inputMethodManager!!.hideSoftInputFromWindow(mainViewPager!!.windowToken, 0)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_playground -> {
                supportActionBar!!.title = getString(R.string.title_playground)
                showFragment(MainPagerAdapter.PLAYGROUND_FRAGMENT_POSITION)
                inputMethodManager!!.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = getString(R.string.title_dashboard)
        inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        mainViewPager = findViewById(R.id.viewpager_main)
        mainViewPager!!.adapter = MainPagerAdapter(supportFragmentManager, this)
        navigation = findViewById(R.id.navigation)
        navigation!!.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        inputMethodManager!!.hideSoftInputFromWindow(mainViewPager!!.windowToken, 0)
    }

    /**
     * Display a [Fragment] of the [ViewPager] in the content area
     */
    private fun showFragment(fragmentPositionId: Int) {
        mainViewPager!!.currentItem = fragmentPositionId
    }

}
