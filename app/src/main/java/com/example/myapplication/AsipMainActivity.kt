package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.AsipMainBinding

class AsipMainActivity : AppCompatActivity() {

    private lateinit var bindingClass: AsipMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = AsipMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }



}