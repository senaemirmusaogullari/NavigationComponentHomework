package com.senaemirmusaogullari.upschoolsenahomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.senaemirmusaogullari.upschoolsenahomework.R
import com.senaemirmusaogullari.upschoolsenahomework.common.viewBinding
import com.senaemirmusaogullari.upschoolsenahomework.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding (FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.anketeBasla.setOnClickListener {
            val name = binding.etAd.text.toString()
            val surname = binding.etSoyad.text.toString()
            val action = HomeFragmentDirections.homeToPersonal(name, surname)
            findNavController().navigate(action)
        }
    }
}