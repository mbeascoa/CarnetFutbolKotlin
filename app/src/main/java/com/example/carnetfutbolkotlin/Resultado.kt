package com.example.carnetfutbolkotlin

import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val inta = intent
        val data = inta.getSerializableExtra("data") as Madridista?


        val datoNombre: String = data?.nombre.toString()
        val datoApellido1: String = data?.apellido1.toString()
        val datoApellido2: String = data?.apellido2.toString()
        val datoTelefono: String = data?.telefono.toString()
        val datoCorreo: String = data?.correo.toString()
        val datoSocio = if (data!!.esSocio) "SI" else "NO"
        val datoMayor = if (data.esMayor) "SI" else "NO"
        val datoResidente = if (data.esResidente) "SI" else "NO"


        textViewCompuesto.setText(
            Html.fromHtml(
                "<p> <h4> Registro Socio: </h4></p> Nombre: <h5>" + datoNombre + "</h5> </p> Apellidos: <h5>" + datoApellido1 + " " + datoApellido2 +
                        "</p></h5> Telefono: <h5> " + datoTelefono + "</p></h5> Email: <h5> " + datoCorreo + "</p></h5> Socio: <h5> " + datoSocio + "</p></h5> Menor Edad: <h5> " + datoMayor + "</p></h5> Extranjero:  <h5> " + datoResidente + "</h5>"
            ), TextView.BufferType.SPANNABLE
        )
    }


    fun closeWindow(view: View?) {
        finish()
    }
}