package Aula2_exercicios

import kotlin.random.Random

fun main() {

    while (true) { // Loop infinito para o jogo continuar indefinidamente
        // Início do jogo
        println("Escolha uma opção:")
        println("1 - Pedra")
        println("2 - Papel")
        println("3 - Tesoura")

        // Lê a entrada do usuário e tenta converter para um número inteiro
        val escolhaUsuario = readLine()?.toIntOrNull()

        // Verifica se a escolha do usuário é válida
        if (escolhaUsuario == null || escolhaUsuario !in 1..3) {
            println("Escolha inválida! Tente novamente.")
            continue // Pede para o usuário tentar novamente
        }

        // Gera a escolha aleatória do computador
        val escolhaComputador = Random.nextInt(1, 4)

        // Exibe as escolhas usando a função opcaoParaString
        println("Você escolheu: ${opcaoParaString(escolhaUsuario)}")
        println("O computador escolheu: ${opcaoParaString(escolhaComputador)}")

        // Verifica quem venceu
        when {
            escolhaUsuario == escolhaComputador -> println("Empate!")
            (escolhaUsuario == 1 && escolhaComputador == 3) ||
                    (escolhaUsuario == 2 && escolhaComputador == 1) ||
                    (escolhaUsuario == 3 && escolhaComputador == 2) -> println("Você venceu!")
            else -> println("O computador venceu!")
        }
    }
}

// Função que converte números em palavras
fun opcaoParaString(opcao: Int): String {
    return when (opcao) {
        1 -> "Pedra"
        2 -> "Papel"
        3 -> "Tesoura"
        else -> "Opção inválida" // Isso não vai acontecer, pois já validamos os valores de 1 a 3
    }
}
