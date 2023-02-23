package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.AsipMainBinding
import com.example.myapplication.databinding.HelloAgainLayoutBinding

class HelloActivity:AppCompatActivity() {
    private lateinit var bindingClass: HelloAgainLayoutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = HelloAgainLayoutBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }



}
