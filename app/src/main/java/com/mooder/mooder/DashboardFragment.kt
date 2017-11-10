package com.mooder.mooder


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


/**
 * A simple [Fragment] subclass.
 */
class DashboardFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater!!.inflate(R.layout.fragment_dashboard, container, false)

        val myWebView = fragmentView.findViewById<WebView>(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://agile-fjord-58944.herokuapp.com/dashboard/?user_id=2")

        return fragmentView
    }

    companion object {
        // Required empty public constructor
        fun newInstance(): DashboardFragment {
            return DashboardFragment()
        }
    }

}
