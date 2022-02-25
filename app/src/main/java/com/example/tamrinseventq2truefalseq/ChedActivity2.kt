package com.example.tamrinseventq2truefalseq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tamrinseventq2truefalseq.databinding.ActivityChed2Binding
import com.example.tamrinseventq2truefalseq.databinding.ActivityMainBinding

class ChedActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityChed2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChed2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}