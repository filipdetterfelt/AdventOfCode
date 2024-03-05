package AoC2021.Dag3

import java.io.File

fun main() {
    val data = File("src/main/kotlin/AoC2021/Dag3/data").readLines()
    var ettor =0
    var nollor=0
    val list = mutableListOf<Int>()

    for (column in data[0].indices){
        val verticalLine = data.map { it[column] }
        println("Kolumn: $column $verticalLine")
        if (column.equals(0)){
            nollor++
        }
        else ettor++
       // for (i in column)
        list.add(column)
       // list.any(1)
    }

}