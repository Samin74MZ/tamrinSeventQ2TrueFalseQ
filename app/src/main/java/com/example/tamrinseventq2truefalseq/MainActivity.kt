package com.example.tamrinseventq2truefalseq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.tamrinseventq2truefalseq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listOfQuestion=Questioner.qList
    var qNumber=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewQ.text=listOfQuestion[qNumber].question
    }

    private fun initView(){
       // updateQuestion(listOfQuestion[qNumber])
        val intent= Intent(this,ChedActivity2::class.java)
        intent.putExtra("question",listOfQuestion[qNumber].answer)
        startActivity(intent)
    }
    private fun updateQuestion(question: Question) {
          binding.textViewQ.text=question.question
    }
    fun choseButton(view:View){
        if (view==binding.buttonPrev){
            if (qNumber==0){
                view.isEnabled
            }else{
                qNumber--
                updateQuestion(listOfQuestion[qNumber])
            }
        }
        if (view==binding.buttonNext){
            if (qNumber==9){
                view.isEnabled
            }else{
                qNumber++
                updateQuestion(listOfQuestion[qNumber])
            }
        }
        if (view==binding.buttonCheat){
            initView()
            listOfQuestion[qNumber].cheat=true
        }
        if (view==binding.buttonF){
            if (binding.buttonF.text==listOfQuestion[qNumber].answer.toString()){
                Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Incorrect!",Toast.LENGTH_SHORT).show()
            }
            view.isEnabled
            binding.buttonT.isEnabled
        }
        if (view==binding.buttonT){
            if (binding.buttonT.text==listOfQuestion[qNumber].answer.toString()){
                Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Incorrect!",Toast.LENGTH_SHORT).show()
            }
            view.isEnabled
            binding.buttonF.isEnabled
        }
    }
}