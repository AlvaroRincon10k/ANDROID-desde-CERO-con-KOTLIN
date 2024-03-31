package com.example.androidmaster.sintaxis

fun main(){
    result(51)
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("holiwi")
    }
}

fun getSemester(mont: Int){
    when(mont){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre no valido")
    }
}

fun getTrimester(mont: Int){
    when(mont){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("trimestre no valido")
    }
}

fun getMonth(mont:Int){
    /*if(mont == 1){
        println("enero")
    }else if (mont == 2){
        println("febrero")
    }else if (mont == 3){
        println("marzo")
    }else if (mont == 4){
        println("abril")
    }else if (mont == 5){
        println("mayo")
    }else if (mont == 6){
        println("junio")
    }else if (mont == 7){
        println("julio")
    }else if (mont == 8){
        println("agosto")
    }else if (mont == 9){
        println("septiembre")
    }else if (mont == 10){
        println("octubre")
    }else if (mont == 11){
        println("noviembre")
    }else if (mont == 12){
        println("diciembre")
    }else{
        println("El nes no existe")
    }*/
    when(mont){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("No es un mes valido")
    }
}

