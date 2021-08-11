package br.edu.tads

fun main() {
    val nomes = Array(2){" "}
    nomes[0] = "Lukas"
    nomes[1] = "Matias"

    for(values in nomes){
        println(values)
    }
    println()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Lukas", "Matias")
    nomes2.forEach {
        println(it)
    }
}