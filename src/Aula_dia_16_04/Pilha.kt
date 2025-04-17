package Aula_dia_16_04

import java.util.*

fun main(){
    val pilha = LinkedList<String>()

    //Prateleira de produtos
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")

    //Acessar primeiro elemento
    println(pilha.peek())

    //Ver tamanho da pilha
    println(pilha.size)

    //Remover um elemento da prateleira(pilha)
    val esgotado = pilha.pop()
    println(esgotado)
    println("Novo produto no topo da pilha: ${pilha.peek()}")

    //Verifica se existem itens
    if(pilha.isEmpty()){
        println("Não há produtos na lista de vendas")
    }else{
        println("Ainda há produtos na lista de vendas")
    }

    //Verifica tudo que tem na prateleira
    println("Na pilha ainda há: $pilha")

    //crio uma fila
    val fila = LinkedList<String>()

    //Adicionar usuarios a Fila
    fila.addLast("Joãozinho")
    fila.addLast("Mariazinha")
    fila.addLast("Pedrinho")

    //Vejo o primeiro usuário da Fila
    println(fila.peek())

    do{
        println("O user ${fila.removeFirst()} entrou no servidor")
        Thread.sleep(5000)
    }while(!fila.isEmpty())

}
