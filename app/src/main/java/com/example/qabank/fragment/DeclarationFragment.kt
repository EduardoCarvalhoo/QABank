package com.example.qabank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.activity.AccountOpeningActivity
import com.example.qabank.databinding.FragmentDeclarationBinding

class DeclarationFragment : Fragment() {

    private var _binding: FragmentDeclarationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDeclarationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentDeclarationAdvanceButton.setOnClickListener {
            val activity = requireActivity() as AccountOpeningActivity
            activity.navigateTo(AddressRegistrationFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}