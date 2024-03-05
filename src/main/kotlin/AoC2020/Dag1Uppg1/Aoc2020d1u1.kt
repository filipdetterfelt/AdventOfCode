package AoC2020.Dag1Uppg1

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.net.URL

//Obs lite hjälp av chatgpt

fun main() {
val day1 = day1u1()
    day1.solution1()
}
class day1u1(val path : String = "src/main/kotlin/AoC2020/Dag1Uppg1/AoCD1u1Data"){


        val reader = File(path).readText()

        val dataList = reader.lines().mapNotNull { it.toInt() }


    fun solution1(): String? {
        var result: String? = null

        for (i in dataList.indices) {
            for (j in i + 1 until dataList.size) {
                if (dataList[i] + dataList[j] == 2020) {
                    result = "${dataList[i]} + ${dataList[j]} = 2020"
                    break
                }
            }
            if (result != null)
                break
        }

        println(result ?: "Ingen match")
        return result

    }
}

/*class Dag1(private val path : String = "src/main/kotlin/AoC2020/Dag1Uppg1/testdata"){
    val file = File(path).readText()
    val list = file.lines().mapNotNull { it.toInt() }
    var result : String? = null

    fun solution1(): String? {
        for (i in list.indices){
            for (j in i+1 until list.size){
                if (list[i] + list[j] == 2020){
                    result = "${list[i]}+ ${list[j]} == 2020"
                    break
                }
            }
            if (result != null)
                break
        }
        return result
    }




}*/













/*
   /* val url = URL("https://adventofcode.com/2020/day/1/input")
    val data = url.readText()

    println("Innehållet från urlen är $data")*/

    val filePath =("C:\\Users\\filli\\IdeaProjects\\AdventOfCode\\src\\main\\kotlin\\AoC2020\\Dag1Uppg1\\AoCD1u1Data")
    var reader = File(filePath).readText()

  // val dataList = listOf(reader)
    val dataList = reader.lines().mapNotNull { it.toIntOrNull() }

   /* for(i in dataList){
        println(i)}*/





    var result : String? = null


    for(i in dataList.indices){
        for (j in i+1 until dataList.size){
            if (dataList[i] + dataList[j] ==2020 ){
                result = "talet ${dataList[i]} + talet ${dataList[j]}"
                break
            }
        }
        if (result != null)
            break
    }
    println(result ?: "Ingen matchning hittades")
 */