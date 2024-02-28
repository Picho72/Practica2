package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imagenDado:ImageView
    lateinit var txtNumero:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenDado = findViewById(R.id.imagenDado)
        txtNumero = findViewById<TextView>(R.id.txtNumero)
    }

    //Metodo especial para acciones
    fun lanzarDado(v: View){
        Log.d("Informacion", "Se preciono el boton")
        val numero = Random.nextInt(6) + 1
        txtNumero.text = "$numero"
        val recurso = when(numero){
            1->{
                R.drawable.dice_1
            }
            2->{
                R.drawable.dice_2
            }
            3->{
                R.drawable.dice_3
            }
            4->{
                R.drawable.dice_4
            }
            5->{
                R.drawable.dice_5
            }
            else->{
                R.drawable.dice_6
            }
        } //when
        imagenDado.setImageResource(recurso)
    }
}