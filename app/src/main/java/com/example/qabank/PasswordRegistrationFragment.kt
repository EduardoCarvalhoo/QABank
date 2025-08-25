package com.example.qabank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentPasswordRegistrationBinding

class PasswordRegistrationFragment : Fragment() {

    private var _binding: FragmentPasswordRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentPasswordRegistrationAdvanceButton.setOnClickListener {
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(PasswordConfirmationFragment())
        }
    }
}