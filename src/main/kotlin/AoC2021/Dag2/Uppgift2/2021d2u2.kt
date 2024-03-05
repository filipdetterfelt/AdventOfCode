package AoC2021.Dag2.Uppgift2

import java.io.File

fun main() {
val dag2 = d2u22021()
    dag2.solution1()
}
class d2u22021(val path : String = "src/main/kotlin/AoC2021/Dag2/Uppgift1/datad2u1"){
    val data = File(path).readLines().toList()
    var horizontel = 0
    var depth = 0
    var aim = 0
    val instructions = data.map { it.split(" ") }

    fun solution1(): String? {
        for ((directions, amountString) in instructions) {
            val amount = amountString.toInt()
            println(depth)

            when (directions) {
                "forward" -> {
                    horizontel += amount
                    if (aim > 0) {
                        depth += amount * aim
                    }
                }

                "down" -> aim += amount
                "up" -> aim -= amount
            }
            /* if(directions.equals("forward")){
            horizontel += amount


            if(aim > 0){
                depth += amount * aim

            }

        }

        else if(directions.equals("down")){
            //depth += amount
            aim += amount
        }
        else if(directions.equals("up")){
           // depth -= amount
            aim -= amount
        }*/
            /*when(directions){
            "forward" -> aim >0 horizontel +=amount
            "down" -> aim +=amount
            "up" -> aim -=amount
        }*/

        }
        println(
            "Horizontel: $horizontel Depth: $depth Aim: $aim" + "\nResult: ${horizontel * depth} ")
        return "$horizontel $depth"

    }

}


/*package AoC2021.Dag2.Uppgift2

import java.io.File

fun main() {
    val data = File("src/main/kotlin/AoC2021/Dag2/Uppgift1/datad2u1").readLines().toList()
    var horizontel = 0
    var depth = 0
    var aim = 0
    val instructions = data.map { it.split(" ") }

    for ((directions, amountString) in instructions){
        val amount = amountString.toInt()
        println(depth)

        when(directions){
            "forward" -> {
                horizontel += amount
                if(aim > 0){
                    depth += amount * aim
                }
            }
            "down" -> aim += amount
            "up" -> aim -= amount
        }
        /* if(directions.equals("forward")){
             horizontel += amount


             if(aim > 0){
                 depth += amount * aim

             }

         }

         else if(directions.equals("down")){
             //depth += amount
             aim += amount
         }
         else if(directions.equals("up")){
            // depth -= amount
             aim -= amount
         }*/
        /*when(directions){
            "forward" -> aim >0 horizontel +=amount
            "down" -> aim +=amount
            "up" -> aim -=amount
        }*/
        println("Horizontel: $horizontel Depth: $depth Aim: $aim" +
                "\nResult: ${horizontel*depth} ")
    }



}*/