package Aula1.exercicios

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    val numeroSecreto = Random.nextInt(1, 101)
    var tentativa: Int
    var tentativas = 0

    println("Tente adivinhar o número entre 1 e 100!")

    while (true) {
        print("Digite seu palpite: ")
        tentativa = scanner.nextInt()
        tentativas++

        when {
            tentativa == numeroSecreto -> {
                println("Parabéns! Você acertou em $tentativas tentativas.")
                break
            }
            tentativa < numeroSecreto -> println("Tente um número maior.")
            else -> println("Tente um número menor.")
        }
    }

    scanner.close()
}