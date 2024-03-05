package AoC2021.Dag2.Uppgift1Inspo

import java.io.File
//Inspiration hämtad från https://github.com/asm0dey/aoc-2021/blob/main/src/Day02.kt
fun main() {
    val data = File("src/main/kotlin/AoC2021/Dag2/Uppgift1/datad2u1").readLines().toList()

    var horizontel = 0
    var depth = 0
    val instructions = data.map { it.split(" ") }

    for((directions ,amountString)in instructions){
        val amount = amountString.toInt()

        when(directions){
            "forward" -> horizontel += amount
            "up" -> depth -= amount
            "down" -> depth += amount
        }
    }
    println("Horizontel $horizontel Depth $depth")
}