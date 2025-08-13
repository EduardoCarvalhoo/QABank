package com.example.qabank.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qabank.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private val binging by lazy { ActivityWelcomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binging.root)

        accessTheAccount()
        setAccountOpening()
    }

    private fun accessTheAccount() {
        binging.accessAccountButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setAccountOpening() {
        binging.openAccountButton.setOnClickListener {
            val intent = Intent(this, AccountOpeningActivity::class.java)
            startActivity(intent)
        }
    }
}