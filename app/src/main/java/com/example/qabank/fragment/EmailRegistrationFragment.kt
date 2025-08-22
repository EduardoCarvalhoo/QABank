package com.example.qabank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentEmailRegistrationBinding

class EmailRegistrationFragment : Fragment() {
    private var _binding: FragmentEmailRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEmailRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentEmailRegistrationAdvanceButton.setOnClickListener {
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(GenderRegistrationFragment())
        }
    }
}