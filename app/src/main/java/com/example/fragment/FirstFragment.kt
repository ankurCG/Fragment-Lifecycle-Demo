package com.example.fragment

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(tag,"First_fragment_onAttach")
        activity?.let {
            Toast.makeText(it,"Hi i m testing ", LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag,"First_fragment_onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(tag,"First_fragment_onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onStart() {
        super.onStart()
        Log.i(tag,"First_fragment_onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(tag,"First_fragment_onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(tag,"First_fragment_onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(tag,"First_fragment_onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(tag,"First_fragment_onDestroyView")

    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(tag,"First_fragment_onActivityCreated")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(tag,"First_fragment_onDetach")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag,"First_fragment_onDestroy")

    }

}