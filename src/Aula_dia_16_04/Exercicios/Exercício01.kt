package Aula_dia_16_04.Exercicios

import java.util.*

fun main(){
    val pilha = LinkedList<String>()

    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")
    pilha.push("Pão")
    pilha.push("Cachaça")
    pilha.push("Salame")

    do{
        println("O item ${pilha.removeLast()} apodreceu")
        Thread.sleep(5000)
    }while(pilha.isNotEmpty())
}