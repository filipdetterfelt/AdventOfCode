package Del2Tomtarna

fun main() {
    var avsluta = false
while (!avsluta){
    println("Sök efter en nisse: ")
    val nisse = readLine()
    if (nisse != null){
         if (nisse == "a"){
            avsluta = true
        }
        val underordnare = rekursion(nisse, tomtar).drop(1).distinct()
        println("$nisse har dessa som sina underordnare $underordnare")
    }


}
}

val tomtar = mapOf(
    "tomten" to listOf("glader","butter"),
    "glader" to listOf("tröger","trötter","blyger"),
    "butter" to listOf("rådjuret","nyckelpigan","haren","räven"),
    "trötter" to listOf("skumtomten"),
    "skumtomten" to listOf("dammråttan"),
    "räven" to listOf("gråshuggan","myran"),
    "myran" to listOf("bladlusen")
)

fun rekursion(name : String, map : Map<String, List <String>>) : List<Any> {
    val undero = map[name]?: emptyList()
    if (undero.isNotEmpty()){
        val names = undero.flatMap { rekursion(it,map) }
        return listOf(name)+names
    }
    return listOf(name)
}
