package AoC2022.Dag1.Uppgift1

import java.io.File

fun main(){

   val data = File("src/main/kotlin/AoC2022/Dag1/Uppgift1/testData").readText()
    val groups = data.trim().split("\n\n")

    var maxCals = 0
    for (i in data){

    }
 /*val groups = data.trim().split("\n\n")

    for ((index,group)in groups.withIndex()){
     val numbers = group.trim().split("\n").map { it.trim() }
     val validNumbers = numbers.filter{it.isNotBlank()}.map { it.toIntOrNull() }

     if(validNumbers.all { it != null }){
      val sum = validNumbers.sumOf { it!! }
      println("Summan för grupp ${index +1}: $sum")
     }
     else{
      println("Ogitligt nummer i grupp ${index +1}")
     }
     println()

    }*/















 /*val groups = mutableListOf<MutableList<String>>()
 val currentGroup = mutableListOf<String>()

  for (line in reader) {
      if (line.isBlank())
  }


 val tempCal = 0
 val sumCaloriList = mutableListOf<Int>()

  for (i in reader){
      println(i)}*/



}