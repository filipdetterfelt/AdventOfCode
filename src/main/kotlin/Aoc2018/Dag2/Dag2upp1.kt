package Aoc2018.Dag2

import java.io.File

fun main() {
    val data = File("src/main/kotlin/Aoc2018/Dag2/data").readText()
    val charCount = mutableMapOf<Char,Int>()

    for(char in data){
        charCount[char] = charCount.getOrDefault(char,0)+1
    }

    val countOfTwo = charCount.count{it.value ==2}
    val countOfThree = charCount.count{it.value ==3}

    println("Förekommer 2 gånger $countOfTwo Förekommer 3 gånger $countOfThree")


}