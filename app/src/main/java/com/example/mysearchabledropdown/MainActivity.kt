package com.example.mysearchabledropdown

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mysearchabledropdown.databinding.ActivityMainBinding
import com.example.mysearchabledropdownlibrary.MyUtils
import com.example.mysearchabledropdownlibrary.MyUtils.reverseString


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if (!::binding.isInitialized) {
            binding = ActivityMainBinding.inflate(layoutInflater)
        }
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val reversed: String = reverseString("hello")
        println(reversed)
    }
}