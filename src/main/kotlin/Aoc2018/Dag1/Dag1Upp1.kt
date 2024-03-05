package Aoc2018.Dag1

import java.io.File

fun main() {
    val dag1 = d1u12018()
    dag1.solution()
}
//Läser in data från fil
class d1u12018(var path : String = "src/main/kotlin/Aoc2018/Dag1/data") {
    val data = File(path).readText()
    val lines = data.trim().split("\n")
    var frequencys = 0

    fun solution(): Int{
        for (line in lines) {
            val operator = line[0]
            val number = line.trim().substring(1).toInt()

            if (operator == '-') {
                frequencys -= number
            } else frequencys += number
        }
        println("Frequency is $frequencys ")

        return frequencys
    }

}



































/*
 val data = File("src/main/kotlin/Aoc2018/Dag1/testData").readText()
    val lines = data.trim().split("\n")
    var total = 0

    for (line in lines){
        val sign = line[0]
        val value = line.trim().substring(1).toInt()

        if(sign =='-'){
            total -= value
        }
        else{ total += value
        }
    }
    println("Total: $total")
 */