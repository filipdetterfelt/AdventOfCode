package AoC2022.Dag1.Uppgift1

import java.io.File

fun main() {
    val data = File("src/main/kotlin/AoC2022/Dag1/Uppgift1/calories").readText().split("\n")

    var maxCalories = 0
    var currentCalories = 0

    for (i in data){
        if (i ==""){
            currentCalories = 0
            continue
        }
        else{
            currentCalories += i.toInt()
        }
        if(currentCalories > maxCalories){
            maxCalories = currentCalories
        }
    }
    println(maxCalories)
}