package com.example.tamrinseventq2truefalseq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tamrinseventq2truefalseq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listOfQuestion=Questioner.qList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}