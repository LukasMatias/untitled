package br.edu.tads

fun main() {
    val values = intArrayOf(200,3,45,6,8,7)

    println("***********VETOR DESORDENADO************")
    values.forEach {
        print(" "+it)

    }
    println()
    println()

   println("***********VETOR ORDENADO************")
    values.sort()
    values.forEach {
        print(" "+it)
    }
}