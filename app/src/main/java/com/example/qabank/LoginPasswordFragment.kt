package com.example.qabank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.qabank.databinding.FragmentLoginPasswordBinding

class LoginPasswordFragment : Fragment() {
    private var _binding: FragmentLoginPasswordBinding? = null
    private val binding get() = _binding!!
    private var receivedCpf: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            receivedCpf = it.getString("user_cpf")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receivedCpf?.let {
            binding.loginTextInputEditTextCpf.setText(receivedCpf)
        }
        binding.fragmentLoginPasswordEnterButton.setOnClickListener {
            Toast.makeText(context, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}