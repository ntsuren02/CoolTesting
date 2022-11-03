package com.coolcats.unittesting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coolcats.unittesting.ViewTextActivity.Companion.KEY
import com.coolcats.unittesting.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.capitalizeButton.setOnClickListener {
            if (binding.inputEdittext.text.toString().isBlank()) {
                Snackbar.make(binding.root, getString(R.string.empty_text), Snackbar.LENGTH_LONG)
                    .show()
            } else {
                startActivity(Intent(this, ViewTextActivity::class.java).also {
                    it.putExtra(KEY, binding.inputEdittext.text.toString().trim())
                })
            }
        }

    }
}