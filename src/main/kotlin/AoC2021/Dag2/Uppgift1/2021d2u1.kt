package AoC2021.Dag2.Uppgift1

import java.io.File

fun main() {
    val dag2 = d2u12021()
    dag2.solution1()
}

class d2u12021(val path : String = "src/main/kotlin/AoC2021/Dag2/Uppgift1/datad2u1"){
    val reader = File(path).readLines()
    var horiontel = 0
    var depth = 0
    var depthDown = 0
    var depthUp = 0
    val dataMap = mutableMapOf<String, MutableList<Int>>()

    fun solution1(): String? {
        println("innan första loop $reader")
        for (line in reader) {
            val part = line.split(" ")
            println("Line $line Part $part")

            val stringValue = part[0]
            val intValue = part[1].toInt()
            println("Efter split Line $line Part $part")

            //dataMap[stringValue] = intValue
            dataMap.getOrPut(stringValue) { mutableListOf() }.add(intValue)


        }
        println("innan sista loop $reader")


        for ((stringValue, intValues) in dataMap) {
            when(stringValue){
                "forward" -> horiontel = intValues.sum()
                "down" -> depthDown = intValues.sum()
                "up" -> depthUp = intValues.sum()

           /* for (intValue in intValues) {

                if (stringValue.equals("forward")) { //add
                    horiontel = intValues.sum()
                } else if (stringValue.equals("down")) { //add
                    depth = intValues.sum()
                    depthDown = depth
                } else if (stringValue.equals("up")) { //delete
                    depth = intValues.sum()
                    depthUp = depth
                    depth = depthDown - depthUp
                }*/

            }
        }
        depth = depthDown - depthUp
        println ("Horizontel: $horiontel Depth: $depth")
        return "Horizontel: $horiontel Depth: $depth"
    }
}

//forward 5
//down 5
//forward 8
//up 3
//down 8
//forward 2


    /*TESTDATA
    forward 5
    down 5
    forward 8
    up 3
    down 8
    forward 2*/




