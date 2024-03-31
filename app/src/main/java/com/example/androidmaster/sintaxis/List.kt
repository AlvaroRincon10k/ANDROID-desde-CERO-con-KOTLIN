package com.example.androidmaster.sintaxis

fun main(){
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(3,"Alvaro")
    //println(weekDays)

    /*if(weekDays.isEmpty()){

    }else{
        weekDays.forEach{ println(it) }
    }*/

    if(weekDays.isNotEmpty()){
        //weekDays.forEach{ println(it) }
    }

    weekDays.last()

    for (item in weekDays){
        //println(item)
    }

    weekDays.forEach{ println(it)}
}



fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())
    //println(readOnly.first())

    //filtrar
    //val example = readOnly.filter { it.contains("a") }
    //println(example)

    readOnly.forEach{ weekDay -> println(weekDay) }
}