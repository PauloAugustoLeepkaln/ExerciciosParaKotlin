package Aula_dia_31_03

class Papel {

    fun luta(elemento: String) : Int{
        if(elemento.equals("TESOURA")){//perde
            println("Você perdeu!")
            return -1 //perca de pontos
        }
        if(elemento.equals("PEDRA")){//GANHA
            println("Você ganhou!")
            return 1 //ganho de pontos
        }
        println("Impate!")
        return 0 //empate
        }
    }
