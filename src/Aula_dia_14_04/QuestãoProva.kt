package Aula_dia_14_04

class QuestãoProva {
    fun main(){
        var nome = ""
        var nomeDoMeio = ""
        var sobrenome = ""

        val nomeCompleto = readln()

        println("Seu nome é composto? s/n")
        val resposta = readln().lowercase()
        if(resposta == "s"){//Ele tem nome composto
            nome = nomeCompleto.substringBefore(" ")//Quebro o nome
            //e fico somente com o que vem antes do espaço

            //EXEMPLO JOÃO MATEUS SILVEIRO
            val aux = nomeCompleto.substringAfter("")//a nova String sera MATEUS SILVEIRA
            nomeDoMeio = aux.substringBefore("")//finalmente pegamos o nome do meio
            sobrenome = aux.substringAfter("")

        }else{//não tem nome composto
            nome = nomeCompleto.substringBefore("")
            sobrenome = nomeCompleto.substringBefore("")


        }
    }
}