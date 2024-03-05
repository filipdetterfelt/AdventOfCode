package AoC2020.Dag1upp1Inspo

import java.io.File

//Inspiration tagen härifrån https://blog.jetbrains.com/kotlin/2021/07/advent-of-code-in-idiomatic-kotlin/
//Svetlana Isakova
fun main() {
   val nmbr = File("src/main/kotlin/AoC2020/Dag1Uppg1/AoCD1u1Data").readLines().map(String::toInt)
    for (i in nmbr){
        for (j in nmbr){
            if (i + j == 2020){
                println("Talet $i + talet $j = ${i+j}")
                println("Svaret blir ${i*j}")
                return
            }
        }
    }

}
