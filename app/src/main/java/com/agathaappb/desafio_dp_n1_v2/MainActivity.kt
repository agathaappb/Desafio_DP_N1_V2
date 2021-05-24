package com.agathaappb.desafio_dp_n1_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.agathaappb.desafio_dp_n1_v2.ValidadorDados.CategorizaDado

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editUser: EditText = findViewById(R.id.editDados)
        val btnValida: Button = findViewById(R.id.btnVerificaDados)

        btnValida.setOnClickListener{
            val dado = CategorizaDado()
            val s = dado.categorizaDados(editUser.text.toString())

            val msgRetorno = Toast.makeText(applicationContext, s, Toast.LENGTH_LONG)
            msgRetorno.show()

        }
    }
}