package com.ardakazanci.bottomnavigationmultipleview.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ardakazanci.bottomnavigationmultipleview.R
import com.ardakazanci.bottomnavigationmultipleview.databinding.FragmentDetailBinding
import com.ardakazanci.bottomnavigationmultipleview.databinding.FragmentDetailBindingImpl

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {


    private lateinit var binding: FragmentDetailBinding
    private lateinit var cameraStr: String

    private fun loadArguments() {
        arguments?.getString("PHOTO_NAME")?.let {
            cameraStr = it
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBindingImpl.inflate(inflater)
        binding.camera = cameraStr
        return binding.root
    }

}
