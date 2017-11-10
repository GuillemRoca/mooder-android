package com.mooder.mooder


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


/**
 * A simple [Fragment] subclass.
 */
class PlaygroundFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater!!.inflate(R.layout.fragment_playground, container, false)

        val playgroundEditText = fragmentView.findViewById<EditText>(R.id.edit_text_playground)
        // show soft keyboard
        playgroundEditText.requestFocus()

        return fragmentView
    }

    companion object {
        // Required empty public constructor
        fun newInstance(): PlaygroundFragment {
            return PlaygroundFragment()
        }
    }

}
