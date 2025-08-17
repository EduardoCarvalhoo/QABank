package com.example.qabank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.databinding.FragmentNameRegistrationBinding

class NameRegistrationFragment : Fragment() {

    private var _binding: FragmentNameRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNameRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }
}