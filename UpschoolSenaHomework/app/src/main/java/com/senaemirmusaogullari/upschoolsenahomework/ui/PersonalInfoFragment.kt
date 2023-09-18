package com.senaemirmusaogullari.upschoolsenahomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.senaemirmusaogullari.upschoolsenahomework.R
import com.senaemirmusaogullari.upschoolsenahomework.common.viewBinding
import com.senaemirmusaogullari.upschoolsenahomework.databinding.FragmentPersonalInfoBinding
import com.senaemirmusaogullari.upschoolsenahomework.model.Personal

class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {

    private val binding by viewBinding(FragmentPersonalInfoBinding::bind)

    private val args by navArgs<PersonalInfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvName.text = args.ad.plus( " ${args.soyad}")

        binding.gecisSayfasi.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val telefon = binding.etTelefon.text.toString()
            val adres = binding.etAdres.text.toString()
            val personalInfo = Personal(args.ad, args.soyad, email, telefon, adres)
            val action = PersonalInfoFragmentDirections.personalToQuestion(personalInfo)
            findNavController().navigate(action)
        }
    }
}


