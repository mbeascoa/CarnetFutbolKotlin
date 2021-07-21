package com.example.carnetfutbolkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ventana_formulario.*


class ventana_formulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_formulario)

    }

    fun irFormulario(view: View?) {
        val i = Intent(this, Resultado::class.java)

        //recojo los valores de los editText
        val nombre = editTextNombre.getText().toString()
        val apellido1 = editText1Apellido.getText().toString()
        val apellido2 = editText2Apellido.getText().toString()
        val telefono = editTextTelefono.getText().toString()
        val correo = editTextCorreo.getText().toString()
        val confcorreo = editTextConfirmaCorreo.getText().toString()
        var soySocio = radioButtonSoySocio.isChecked
        val noSoySocio = radioButtonNoSoySocio.isChecked
        val soyMenor = radioButtonMenor.isChecked
        var soyMayor = radioButtonMayor!!.isChecked
        var soyResidente = radioButtonResidente!!.isChecked
        val noSoyResidente = radioButtonNoResidente!!.isChecked
        if (confcorreo == correo) {

            //  vemos la selección del radio group soy Socio
            val radioSocioSel = rgSocio!!.checkedRadioButtonId
            when (radioSocioSel) {
                R.id.radioButtonSoySocio -> soySocio = true
                R.id.radioButtonNoSoySocio -> soySocio = false
            }
            //  vemos la selección del radio group soy Mayor
            val radioMayorSel = rgMayor!!.checkedRadioButtonId
            when (radioMayorSel) {
                R.id.radioButtonMayor -> soyMayor = true
                R.id.radioButtonMenor -> soyMayor = false
            }
            //  vemos la selección del radio group Residente
            val radioResidenteSel = rgResidente!!.checkedRadioButtonId
            when (radioResidenteSel) {
                R.id.radioButtonResidente -> soyResidente = true
                R.id.radioButtonNoResidente -> soyResidente = false
            }
            val dataCourse = Madridista(
                nombre,
                apellido1,
                apellido2,
                telefono,
                correo,
                soySocio,
                soyMayor,
                soyResidente
            )
            val bundle = Bundle()
            bundle.putSerializable("data", dataCourse)
            i.putExtras(bundle)
            startActivity(i)
        } else {
            Toast.makeText(this, "No son iguales los Email", Toast.LENGTH_SHORT).show()
        }
    }
}


