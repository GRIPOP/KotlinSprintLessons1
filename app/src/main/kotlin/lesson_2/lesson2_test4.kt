package org.example.app.lesson_2

const val BUFF_PERCENTAGE = 20

fun main() {
    val crystallineOre = 7
    val ironOre = 11

    val addBuffCrystallineOre = crystallineOre * BUFF_PERCENTAGE / 100
    val addBuffIronOre = ironOre * BUFF_PERCENTAGE / 100

    println(addBuffCrystallineOre)
    println(addBuffIronOre)
}