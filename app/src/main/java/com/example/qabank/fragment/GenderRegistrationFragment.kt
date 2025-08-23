package com.example.qabank.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentGenderRegistrationBinding

class GenderRegistrationFragment : Fragment() {

    private var _binding: FragmentGenderRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGenderRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentGenderRegistrationAdvanceButton.setOnClickListener {
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(DeclarationFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}