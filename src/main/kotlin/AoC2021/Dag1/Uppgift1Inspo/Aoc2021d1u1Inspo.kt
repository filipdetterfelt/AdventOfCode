package AoC2021.Dag1.Uppgift1Inspo

import java.io.File
//Inspiration från https://blog.jetbrains.com/kotlin/2021/12/advent-of-code-2021-in-kotlin-day-1/
//Anton Arhipov
//https://github.com/antonarhipov/advent-of-code-2021/blob/main/src/Day01.kt
fun main(){
    fun convertInputToInt(name : String) = File("src/main/kotlin/AoC2021/Dag1/Uppgift1/data2021d1u1")
        .readLines().map { it.toInt() }

    val input = convertInputToInt("Day01")
    val list : List<List<Int>> = input.windowed(2)

    println(input.windowed(2).count{(a,b) -> a < b})
}