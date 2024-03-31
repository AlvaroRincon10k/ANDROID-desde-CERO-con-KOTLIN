package com.example.androidmaster.sintaxis

val age: Int = 30

fun main(){

    showMiName()
    showMyAge()
    add(5, 6)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
}

fun showMiName(){
    println("Me llamo Alvaro")
}

fun showMyAge(currentAge:Int = 30){
    println("Tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber:Int, secondNumber: Int): Int{
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber:Int, secondNumber: Int) = firstNumber - secondNumber

fun variablesAlfanumericas(){

    /**
     * Variables Alfanumericas
     */

    //Char
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String
    val stringExample:String = "Aristidevs suscribete hola"
    val stringExample2:String = "Aristidevs suscribete hola"
    val stringExample3:String = "4"
    val stringExample4:String = "23"

    var stringConcatenar:String = "Hola"
    stringConcatenar = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenar)
    val example123:String = age.toString()
}

fun variablesBolean(){
    /**
     * Variables booleans
     */

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val boolenaExample3:Boolean = false
}

fun variablesNumericas(){
    /**
     * Variables Numericas
     */

    //Int

    var age2: Int = 30

    age2 = 29

    //Long
    val example:Long = 30

    //Float
    val floatExample:Float = 30.5f

    //Double
    val doubleExample:Double = 3241.3123123

    println("Sumar:")
    println( age + age2)

    println("Restar:")
    println( age - age2)

    println("Multiplicar:")
    println( age * age2)

    println("Division:")
    println( age / age2)

    println("Modulo:")
    println( age % age2)

    var exampleSuma = age + floatExample.toInt()
}