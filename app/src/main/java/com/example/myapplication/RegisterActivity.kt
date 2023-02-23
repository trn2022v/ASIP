package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.RegisterLayoutBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var bindingClass: RegisterLayoutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = RegisterLayoutBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }


}
