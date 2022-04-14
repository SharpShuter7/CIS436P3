package com.nshute.cis436p3.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nshute.cis436p3.R

class Spinner : Fragment() {

    companion object {
        fun newInstance() = Spinner()
    }

    private lateinit var viewModel: SpinnerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.spinner_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpinnerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}