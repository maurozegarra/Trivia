package com.maurozegarra.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maurozegarra.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
