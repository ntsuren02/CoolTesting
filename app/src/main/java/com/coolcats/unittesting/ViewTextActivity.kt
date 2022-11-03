package com.coolcats.unittesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coolcats.unittesting.databinding.ActivityViewTextBinding

class ViewTextActivity : AppCompatActivity() {


    private lateinit var binding: ActivityViewTextBinding
    companion object{
        const val KEY = "TEXT_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.getStringExtra(KEY)?.let {
            binding.capTextview.text = it.uppercase()
        }
    }
}