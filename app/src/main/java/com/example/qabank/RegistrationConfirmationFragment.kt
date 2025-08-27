package com.example.qabank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import com.example.qabank.databinding.FragmentRegistrationConfirmationBinding

class RegistrationConfirmationFragment : Fragment() {

    private var _binding: FragmentRegistrationConfirmationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationConfirmationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = activity?.findViewById<Toolbar>(R.id.activity_account_opening_toolbar)
        toolbar?.visibility = View.GONE
        binding.fragmentRegistrationConfirmationBackButton.setOnClickListener {
            activity?.finish()
        }
    }
}