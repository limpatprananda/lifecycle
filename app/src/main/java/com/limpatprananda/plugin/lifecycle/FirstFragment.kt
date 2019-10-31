package com.limpatprananda.plugin.lifecycle


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)
        rootView.button.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        Timber.i("onCreateView: lifecycle log")
        return rootView
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Timber.i("onAttach: lifecycle log")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate: lifecycle log")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.i("onActivityCreated: lifecycle log")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart: lifecycle log")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume: lifecycle log")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause: lifecycle log")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop: lifecycle log")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.i("onDestroyView: lifecycle log")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.i("onDetach: lifecycle log")
    }
}
