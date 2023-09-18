package com.senaemirmusaogullari.upschoolsenahomework.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.senaemirmusaogullari.upschoolsenahomework.R
import com.senaemirmusaogullari.upschoolsenahomework.common.viewBinding
import com.senaemirmusaogullari.upschoolsenahomework.databinding.FragmentQuestionBinding
import com.senaemirmusaogullari.upschoolsenahomework.model.Question

class QuestionFragment : Fragment(R.layout.fragment_question) {

    private val binding by viewBinding(FragmentQuestionBinding::bind)

    private val args by navArgs<QuestionFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvName.text = args.personalInfo.ad.plus( " ${args.personalInfo.soyad}")

        binding.gecisSayfasi.setOnClickListener {
            val yas = binding.etYas.text.toString()
            val meslek = binding.etMeslek.text.toString()
            val hobiler = binding.etHobiler.text.toString()
            val question = Question(args.personalInfo, yas, meslek, hobiler)
            val action = QuestionFragmentDirections.questionToResult(question)
            findNavController().navigate(action)

        }
    }
}
