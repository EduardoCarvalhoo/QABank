package com.example.qabank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentValidateInformationBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ValidateInformationFragment : Fragment() {

    private var _binding: FragmentValidateInformationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentValidateInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            delay(4000)
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(RegistrationConfirmationFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}