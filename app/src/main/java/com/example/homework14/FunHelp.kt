package com.example.homework14

fun Human.amount() : Int{
    var human = Human()
    var amount = human.mammyAge + human.daddyAge
    print("Сумма полей:$amount")
    return amount
}