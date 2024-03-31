package com.example.androidmaster.sintaxis

fun main(){
    var name:String = "Alvaro"

    val weekDays= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(weekDays.size)

    weekDays[0] = "Feliz lunes"

    println(weekDays[0])

    if(weekDays.size >= 8) {
        //println(weekDays[7])
    } else{
        //println("No hay mas valores en el array")
    }

    //Bucles para arrays

    for (position in weekDays.indices){
        //println(weekDays[position])
    }

    for((postion, value) in weekDays.withIndex()){
        //println("La posicion $postion, contiene $value")
    }

    for(weekDay in weekDays){
        println("Ahoar es $weekDay")
    }
}