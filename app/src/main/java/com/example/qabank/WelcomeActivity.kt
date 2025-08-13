package com.example.qabank

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
    }

    private fun accessTheAccount(){
        binging.accessAccountButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}