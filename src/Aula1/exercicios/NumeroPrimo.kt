package Aula1.exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite um número: ")
    val numero = scanner.nextInt()
    var ehPrimo = true

    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (i in 2 until numero) {
            if (numero % i == 0) {
                ehPrimo = false
                break
            }
        }
    }

    if (ehPrimo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }

    scanner.close()
}