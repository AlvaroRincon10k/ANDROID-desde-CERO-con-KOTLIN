package com.example.androidmaster.sintaxis

fun main(){
    ifMultipleOR()
}

fun ifMultipleOR(){
    var pet = "dog"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var inHappy = true

    if(age >= 18 && parentPermission == true && inHappy){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifInt(){
    var age = 18

    if (age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }

}

fun ifBoolean(){
    var soyFeliz = true

    if(!soyFeliz){
        println("Estoy triste")
    }
}

fun ifAnidado(){
    val animal = "dog"
    if (animal == "dog" ){
        println("Es un perrito!")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "bird"){
        println("Es un pajaro")
    }else{
        println("No es el animal esperado")
    }
}

fun ifBasico(){
    val name = "Pablor"

    if(name == "Aris"){
        println("Oye la varia name es $name")
    }else{
        println("Este no es Aris")
    }
}