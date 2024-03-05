package AoC2020.Dag1upp2Inspo

import java.io.File

//Inspiration tagen härifrån https://blog.jetbrains.com/kotlin/2021/07/advent-of-code-in-idiomatic-kotlin/
//Svetlana Isakova
fun main() {
    val nmbr = File("src/main/kotlin/AoC2020/Dag1Uppg1/AoCD1u1Data").readLines().map(String::toInt)

    for (i in nmbr){
        for (j in nmbr){
            for(k in nmbr){
                if (i + j + k == 2020){
                    println("Talet $i + talet $j + talet $k = ${i+j+k}")
                    println("Svaret blir ${i*j*k}")
                    return
            }

            }
        }
    }

}