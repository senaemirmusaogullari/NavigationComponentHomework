package com.senaemirmusaogullari.upschoolsenahomework.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.senaemirmusaogullari.upschoolsenahomework.R
import com.senaemirmusaogullari.upschoolsenahomework.common.viewBinding
import com.senaemirmusaogullari.upschoolsenahomework.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)

    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvAd.text = args.question.personalInfo.ad
            tvSoyad.text = args.question.personalInfo.soyad
            tvEmail.text = args.question.personalInfo.email
            tvTelefon.text = args.question.personalInfo.telefon
            tvAdres.text = args.question.personalInfo.adres
            tvYas.text = args.question.yas
            tvMeslek.text = args.question.meslek
            tvHobi.text = args.question.hobiler
        }
    }

}



