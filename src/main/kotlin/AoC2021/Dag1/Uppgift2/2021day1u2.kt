package AoC2021.Dag1.Uppgift2

import java.io.File
import kotlin.math.min


    /*  val filePath = "C:\\Users\\filli\\IdeaProjects\\AdventOfCode\\src\\main\\kotlin\\AoC2021\\Dag1\\Uppgift2\\datad1u2"
    val reader = File(filePath).readLines()
    var sum = 0
    val sumList = mutableListOf<MutableList <Int>>()

    for ((index, line) in reader.withIndex()){
        println(line)
        val number = line.trim().toIntOrNull() ?: 0
        sum += number

        if((index +1)%3 == 0 && index +1 < reader.size){
            print("\n")
            sumList.add(mutableListOf(sum))
            sum = 0
        }
    }
    if(sum != 0){
        sumList.add(mutableListOf(sum))
    }

    println("Sumlist $sumList")
var counter = 0
    for (i in 0 until sumList.size -1){
        if(i < i+1){
            counter++
        }

    }
    println(counter)*/
    fun main() {
        val dag1 = day1u2()
        dag1.solution1()
        val dataList = mutableListOf<List<Int>>()
        dag1.countIncreases(dataList)
    }

class day1u2(val path : String = "src/main/kotlin/AoC2021/Dag1/Uppgift2/datad1u2"){

    val reader = File(path).readLines()
   // val sumList = reader.map { it.trim().toIntOrNull() ?: 0 }
    val dataList = mutableListOf<List <Int>>()

    fun solution1(): List<List<Int>>{
    for (i in reader){
        println(i)}

   for (i in 0 until reader.size step 3){
       val endIndex = minOf(i +3,reader.size)
       val group = reader.subList(i,endIndex).map { it.trim().toIntOrNull() ?: 0}
       dataList.add(group)
   }

    println("Result $dataList")
    val numberHeigts = countIncreases(dataList)
    println("Heigts = $numberHeigts")

return dataList
}


fun countIncreases(dataList : List<List<Int>>): Int {
    var counter = 0

    for (i in 0 until dataList.size - 1) {
        val currentGroup = dataList[i]
        val nextGroup = dataList[i + 1]

        for (j in 0 until min(currentGroup.size, nextGroup.size)) {
            if (nextGroup[j] > currentGroup[j]) {
                counter++

            }
        }
        /* if(dataList[i] < dataList[i +1]){
            counter++
        }*/
    }
    return counter
}
}






//[[457], [454], [405], [435], [445], [395], [364], [369], [486], [599], [705], [702], [691], [686]