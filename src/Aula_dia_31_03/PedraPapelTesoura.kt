package Aula_dia_31_03


class PedraPapelTesoura {
    fun main(){
        do{
            println("1-JOGAR")
            println("2-")
            println("3-SAIR!")

            val opcao = readln()//USUARIO DIGITA A OPÇÃO

            when(opcao.toInt()){
                1 -> jogar()
                2 -> print("placar")
                3 -> print("saindo...")
            }
        }while(opcao != "0")

        }
    }

fun jogar(){

    println("Digite seu nickname: ")
    val nickname = readln() //O USUARIO DIGITA SEU NICK

    println ("QUE OS JOGOS COMECEM!")
    var rodadas = 1
    do {
        println("O que você quer jogar? ")
        println("Pedra, papel ou tesoura? ")
        var jogada = readln().uppercase()
        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = computador()//movimento do PC
        println("O computador jogou: $movimentoPC")

        when(jogada){
            "PEDRA" -> {
                pontos = pedra.luta(movimentoPC)
            }
            "PAPEL" -> {
                pontos = tesoura.luta(movimentoPC)
            }
            "TESOURA" -> {
                pontos = tesoura.luta(movimentoPC)
            }
        }
        println("Você tem: $pontos pontos!")
        rodadas++ //no final da rodada incrementa
    }while(rodadas <= 3)
}

fun computador(): String{
    /**Aqui temos um RANGE que é determinado por (1..3)
     * um range é um intervalo numérico, neste caso de 1 a 3
     * a função .random ira gerar um número aleatório dentro
     * desse intervalo que determinamos*/
    val movimento = (1..3).random()
    when(movimento){
        1-> return "TESOURA"
        2-> return "PEDRA"
        3-> return "PAPEL"
    }
    return ""
}