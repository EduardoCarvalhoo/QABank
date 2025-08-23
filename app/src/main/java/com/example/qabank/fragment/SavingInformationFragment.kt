package com.example.qabank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.qabank.PasswordRegistrationStepFragment
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentSavingInformationBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SavingInformationFragment : Fragment() {

    private var _binding: FragmentSavingInformationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavingInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            delay(4000)
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(PasswordRegistrationStepFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}