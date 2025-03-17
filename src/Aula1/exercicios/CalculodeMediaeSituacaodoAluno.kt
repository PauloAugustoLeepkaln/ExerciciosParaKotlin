package Aula1.exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var soma = 0.0
    val qtdNotas = 3

    for (i in 1..qtdNotas) {
        print("Digite a nota $i: ")
        soma += scanner.nextDouble()
    }

    val media = soma / qtdNotas
    println("Média: $media")

    when {
        media >= 7 -> println("Aprovado!")
        media >= 5 -> println("Recuperação.")
        else -> println("Reprovado.")
    }

    scanner.close()
}