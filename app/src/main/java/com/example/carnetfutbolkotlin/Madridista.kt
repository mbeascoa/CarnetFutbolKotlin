package com.example.carnetfutbolkotlin

import java.io.Serializable


class Madridista (nom:String, ape1: String, ape2: String, tel:String, cor:String , essoc:Boolean , esmay:Boolean, esres:Boolean)  : Serializable {
    var nombre: String? = nom
    var apellido1: String? = ape1
    var apellido2: String? = ape2
    var telefono: String? = tel
    var correo: String? = cor
    var esSocio = essoc
    var esMayor = esmay
    var esResidente = esres
}