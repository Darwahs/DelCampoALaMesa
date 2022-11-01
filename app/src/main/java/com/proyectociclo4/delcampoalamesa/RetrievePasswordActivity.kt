package com.proyectociclo4.delcampoalamesa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proyectociclo4.delcampoalamesa.databinding.RetrievePasswordWindowBinding

class RetrievePasswordActivity : AppCompatActivity() {

    lateinit var binding: RetrievePasswordWindowBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = RetrievePasswordWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}