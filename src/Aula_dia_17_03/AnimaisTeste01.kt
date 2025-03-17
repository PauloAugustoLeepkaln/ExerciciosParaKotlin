package Aula_dia_17_03

fun main() {
    var gato: Gato = Gato()
    gato.nome = "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"


    val animal: Animal = gato
    println(animal.nome)

    var cachorro: Cachorro = Cachorro()
    cachorro.nome = "cachorro"
    cachorro.habitat = "domestico"
    cachorro.especie = "canino"
    cachorro.dieta = "carne"

    println(cachorro.somAnimal())

    val animal2 = Animal()
    println(animal.somAnimal())
    /*Toda Classe começa com letra MAIUSCUlA e segue o padrão CamelCase
    *Exemplo: MinhaClasse*/

    /*Os objetos começam com letra MINUSCULA
    *Exemplo: minhaObjeto*/

}