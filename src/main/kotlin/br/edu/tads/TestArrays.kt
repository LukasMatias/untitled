package br.edu.tads

fun main() {

    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    var count = 0

    for (valor in values){
        println("Valor: "+valor)
    }
    println("tamanho do vetor: "+ values.size)

    for(index in values.indices){
        println("Interando pelos índices do vetor[" + count +"]:" + index)
        count++
    }

    values.forEach {
        print(it)
    }
}