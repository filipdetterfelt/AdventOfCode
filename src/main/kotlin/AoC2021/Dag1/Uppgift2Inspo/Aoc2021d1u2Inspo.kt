package AoC2021.Dag1.Uppgift2Inspo

import java.io.File

//Inspiration tagen från https://github.com/antonarhipov/advent-of-code-2021/blob/main/src/Day01.kt

fun main(){
    fun convertInputToInt(name : String) = File("src/main/kotlin/AoC2021/Dag1/Uppgift1/data2021d1u1")
        .readLines().map { it.toInt() }

    val input = convertInputToInt("Day01")
    println(input.windowed(4).count{it[0] < it[3]})
}