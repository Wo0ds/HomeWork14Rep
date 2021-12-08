package com.example.homework14

open class Robot {
    open val name: String = "Robert"
    open val type: String = "Мирный Робот"
    val price: Double = 1500.0
}
class WarRobot : Robot() {
    override val name: String = "WarkV-A1"
    override val type: String = "Военный Робот"
    val numberOfMachineGuns: Int = 2
}
class RobotToy : Robot() {
    override val name: String = "Tobbie"
    override val type: String = "Робот Игрушка"
    val numberOfFunnyPhrases: Int = 8
}
class ZooRobot : Robot() {
    override val name: String = "Zora"
    override val type: String = "Зооробот"
    val numberOfPaws: Int = 4
}
class FlyingRobot : Robot() {
    override val name: String = "Fantes"
    override val type: String = "Летающий робот"
    val jetpackName = "Martin Jetpack"
}
object Singleton {
    val list = arrayListOf<Robot>()
}

fun main() {
    val robot = Robot()
    robot.extension()
}