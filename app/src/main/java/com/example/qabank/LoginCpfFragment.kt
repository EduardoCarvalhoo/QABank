package com.example.qabank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qabank.databinding.FragmentLoginCpfBinding

class LoginCpfFragment : Fragment() {

    private var _binding: FragmentLoginCpfBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginCpfBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentLoginAdvanceButton.setOnClickListener {
            val cpf = binding.loginTextInputEditTextCpf.text.toString()
            val loginPasswordFragment = LoginPasswordFragment()
            val bundle = Bundle()
            bundle.putString("user_cpf", cpf)
            loginPasswordFragment.arguments = bundle
            (activity as LoginActivity).navigateTo(loginPasswordFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}