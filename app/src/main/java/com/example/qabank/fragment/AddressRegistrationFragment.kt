package com.example.qabank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentAddressRegistrationBinding

class AddressRegistrationFragment : Fragment() {

    private var _binding: FragmentAddressRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddressRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentAddressRegistrationAdvanceButton.setOnClickListener {
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(IncomeFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}