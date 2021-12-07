package com.example.homework14

class HomeWork14 {
}

// вывести 20 первых чисел фибоначчи
fun numbersFibo () {
    var f: Long = 0
    var f1: Long = 1
    var f2: Long = 0
    for (i in 1..20) {
        f = f1
        f1 = f2
        f2 = f + f1
        println(f2)

    }
}
//Создать data класс с 2 полями типа int и 5
//любыми полями. Сделать функцию для
//генерации объекта data класса рандомными
//числами.

open class Human () {
    open val name = "Bob"
    open val mammyName = "Alla"
    open val daddyName = "Alex"
    open val gender = "Man"
    open val favoriteTea = "Lipton"
    open val mammyAge:Int = (Math.random()*20).toInt()
    open val daddyAge:Int = (Math.random()*30).toInt()
}

fun generation() {
    val human = Human()
    println(human.mammyAge)
    println(human.daddyAge)
}
class Kids : Human() {
    override val name = "Nina"
    override val mammyName = "Bella"
    val schoolName = "Shazaza"
    override val mammyAge:Int = (Math.random()*20).toInt()
    override val daddyAge:Int = (Math.random()*30).toInt()
}
//Сделать класс ‘Util’ который будет содержать в
//себе поля типа класса наследника и метод
//который будет считать и возвращать сумму
//полей data class
class Util() {
    val name = "Nina"
    val mammyName = "Bella"
    val daddyName = "John"
    val gender = "Woman"
    val favoriteTea = "Lipton"
    private val mammyAge:Int = (Math.random()*20).toInt()
    private val daddyAge:Int = (Math.random()*30).toInt()

    fun counting():Int {
        var result = mammyAge + daddyAge
        print("Сумма полей класса: $result")
        return result
    }
}
fun main() {
//    generation()
//    val util = Util()
//    util.counting()
//    var human = Human()
//    human.amount()
}