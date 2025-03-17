package Aula2_exercicios
import kotlin.random.Random


fun main(){
    print("Qual o nome do jogador 1? ")
    val player1 = readLine()!!
    print("Qual o nome do jogador 2? ")
    val player2 = readLine()!!

    val numeroSecreto = Random.nextInt(1, 101)

    var tentativaPlayer1 = 0
    var tentativaPlayer2 = 0

    println("$player1, tente adivinhar o número")
    var palpitePlayer1: Int
    do {
        print("$player1, qual o seu palpite?")
                palpitePlayer1 = readLine()!!.toInt()
            tentativaPlayer1++
        when {
            palpitePlayer1 < numeroSecreto -> println("🔼 O número secreto é maior!")
            palpitePlayer1 > numeroSecreto -> println("🔽 O número secreto é menor!")
            else -> println("🎉 $player1, você acertou o número secreto!")
        }
    } while (palpitePlayer1 != numeroSecreto)

    println("$player2, tente adivinhar o número")
    var palpitePlayer2: Int
    do {
        print("$player2, qual o seu palpite?")
        palpitePlayer2 = readLine()!!.toInt()
        tentativaPlayer2++
        when {
            palpitePlayer2 < numeroSecreto -> println("🔼 O número secreto é maior!")
            palpitePlayer2 > numeroSecreto -> println("🔽 O número secreto é menor!")
            else -> println("🎉 $player2, você acertou o número secreto!")
        }
    } while (palpitePlayer2 != numeroSecreto)

    if (tentativaPlayer1 < tentativaPlayer2) {
        println("\n🏆 Parabéns, $player1! Você acertou o número secreto em $tentativaPlayer1 tentativas!")
        println("$player2 fez $tentativaPlayer2 tentativas.")
    } else {
        println("\n🏆 Parabéns, $player2! Você acertou o número secreto em $tentativaPlayer2 tentativas!")
        println("$player1 fez $tentativaPlayer1 tentativas.")

    }


}