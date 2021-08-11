package br.edu.tads

fun main() {
    val salario = DoubleArray(3)
    salario[0] = 10.00
    salario[1] = 30.00
    salario[2] = 0.00

    salario.forEach {
        println(it)
    }

    salario.forEachIndexed { index, valor ->
        salario[index] = valor * 1.1
    }

    salario.forEach {
        println(it)
    }
}