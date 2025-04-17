package Aula_dia_31_03

class Tesoura {

    fun luta(elemento: String) : Int{
        if(elemento.equals("PEDRA")){//perde
            println("Você perdeu!")
            return -1 //perca de pontos
        }
        if(elemento.equals("PAPEL")){//GANHA
            println("Você ganhou!")
            return 1 //ganho de pontos
        }
        println("Impate!")
        return 0 //empate
    }
}