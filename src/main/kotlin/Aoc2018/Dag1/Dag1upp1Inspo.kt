package Aoc2018.Dag1

import java.io.File
//Inspiration tagen från https://todd.ginsberg.com/post/advent-of-code/2018/day1/
class d1u12018inspo(){
    val data = File("src/main/kotlin/Aoc2018/Dag1/data").readLines().toList().map { it.toInt() }.sum()
}

fun main() {
    val dag1 = d1u12018inspo()
    println(dag1.data)
}