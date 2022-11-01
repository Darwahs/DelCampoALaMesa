package com.proyectociclo4.delcampoalamesa

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.proyectociclo4.delcampoalamesa.databinding.MainWindowBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: MainWindowBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = MainWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener{validar()}
        binding.button2.setOnClickListener{go_register_window()}
        binding.recoveryButton.setOnClickListener{go_recovery_password()}
    }

    fun validar()
    {
        val usuario:String = binding.username.text.toString()
        val contrasenia:String = binding.password.text.toString()
        val username = "Darwahs"


        if(usuario.isEmpty() and contrasenia.isEmpty())
        {
            binding.username.setHint("INGRESE USUARIO")
            binding.username.setHintTextColor(Color.LTGRAY)
            binding.password.setHint("INGRESE CONTRASEÑA")
            binding.password.setHintTextColor(Color.LTGRAY)
            Toast.makeText(this, "INGRESE USUARIO Y CONTRASEÑA", Toast.LENGTH_LONG).show()
        }

        else if(usuario.isEmpty() || contrasenia.isEmpty())
        {
            if(usuario.isEmpty())
            {
                binding.username.setHint("INGRESE USUARIO")
                binding.username.setHintTextColor(Color.LTGRAY)
                Toast.makeText(this, "INGRESE USUARIO", Toast.LENGTH_LONG).show()
            }
            else
            {
                binding.password.setHint("INGRESE CONTRASEÑA")
                binding.password.setHintTextColor(Color.LTGRAY)
                Toast.makeText(this, "INGRESE CONTRASEÑA", Toast.LENGTH_LONG).show()
            }
        }

        else if(usuario == username)
        {
            if(contrasenia == "123456")
            {
                Toast.makeText(this, "¡BIENVENIDO ${username.uppercase()}!", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this, "CONTRASEÑA INCORRECTA", Toast.LENGTH_LONG).show()
            }
        }

        else
        {
            Toast.makeText(this, "USUARIO NO RESGISTRADO", Toast.LENGTH_LONG).show()
        }
    }

    fun go_register_window()
    {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun go_recovery_password()
    {
        val intent = Intent(this, RetrievePasswordActivity::class.java)
        startActivity(intent)
        finish()
    }
}