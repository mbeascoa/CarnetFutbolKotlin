package com.example.carnetfutbolkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //se pone el setContent a la ventana actual
        imageViewCarnetMadridista.setImageResource(R.drawable.carnetmadridista)
    }



fun cambiarActividad(view: View?) {
    val i = Intent(this, ventana_formulario::class.java)
    startActivity(i)
}
}