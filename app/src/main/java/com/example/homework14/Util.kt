package com.example.homework14

fun Robot.extension():String {
    println("Имя робота: $name\nТип робота: $type\nЦена:$price$")
    return name
}
fun WarRobot.extension():String {
    println("Имя робота: $name\nТип робота: $type\nКоличество пулемётов: $numberOfMachineGuns")
    return name
}
fun RobotToy.extension():String {
    print("Имя робота: $name\nТип робота: $type\nКоличество веселых фраз $numberOfFunnyPhrases")
    return name
}
fun ZooRobot.extension():String {
    print("\nИмя робота: $name\nТип робота: $type\nКоличество лап: $numberOfPaws")
    return name
}
fun FlyingRobot.extension() : String {
    print("\nИмя робота: $name\nТип робота: $type\nНазвание джетпака: $jetpackName")
    return name
}
