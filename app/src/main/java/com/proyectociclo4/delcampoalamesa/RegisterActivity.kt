package com.proyectociclo4.delcampoalamesa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.proyectociclo4.delcampoalamesa.databinding.RegisterWindowBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: RegisterWindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //------------------------- OPCIONES TIPOS DOCUMENTOS ---------------------------
        val spinner_documentos = findViewById<Spinner>(R.id.tips_documentos)

        val tipos_documentos = listOf("Seleccione Una Opción", "Cédula", "Cédula Extranjería",
            "Número Pasaporte")

        val adaptador = ArrayAdapter(this, R.layout.spinner_appearance, tipos_documentos)
        spinner_documentos.adapter = adaptador
        //-------------------------------------------------------------------------------

        //---------------------------- OPCIONES DEPARTAMENTOS ---------------------------
        val spinner_departamentos = findViewById<Spinner>(R.id.departamentos)

        val departamentos = listOf("Seleccione Una Opción", "Antioquia", "Bogotá",
            "Valle Del Cauca", "Chocó")

        val adaptador_dos = ArrayAdapter(this, R.layout.spinner_appearance, departamentos)
        spinner_departamentos.adapter = adaptador_dos
        //-------------------------------------------------------------------------------

        //----------------------------- OPCIONES CIUDADES -------------------------------
        val spinner_ciudades = findViewById<Spinner>(R.id.ciudades)

        val ciudades = listOf("Seleccione Una Opción", "Medellín", "Bogotá", "Cali", "Quibdó")

        val adaptador_tres = ArrayAdapter(this, R.layout.spinner_appearance, ciudades)
        spinner_ciudades.adapter = adaptador_tres
        //-------------------------------------------------------------------------------
    }
}