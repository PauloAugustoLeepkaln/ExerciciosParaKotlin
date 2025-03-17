package Aula_dia_17_03

//Nome cientifico, especie, dieta, habitat
//Essa nova classe é uma superclasse
//A palavra OPEN é usada para indicar que uma classe pode ser herdada.

open class Animal {
    //Atributos
    var nome: String = ""
        get() = field
    var especie: String = ""
    var dieta: String = ""
    var habitat: String = ""
/*ENCAPSULAMENTO: é uma forma de controle sobre os atributos, quem pode acessar ou não*/

    //Metodos
    open fun somAnimal(): String{
        return "Faz barulho!"

    }
}