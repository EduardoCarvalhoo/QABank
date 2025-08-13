package com.example.qabank.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qabank.R
import com.example.qabank.databinding.ActivityAccountOpeningBinding
import com.example.qabank.fragment.CpfAndTermsFragment
import com.example.qabank.fragment.LoginCpfFragment

class AccountOpeningActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAccountOpeningBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupToolbar()
        loadInitialFragment(savedInstanceState)
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.activityAccountOpeningToolbar)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.back_button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun loadInitialFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                binding.activityAccountOpeningContainerFragment.id, CpfAndTermsFragment()
            ).commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        if (supportFragmentManager.popBackStackImmediate()) {
            return true
        }
        return super.onSupportNavigateUp()
    }
}