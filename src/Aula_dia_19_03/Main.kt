package Aula_dia_19_03

var expressaoRegular = Regex("[0-5]")
//variável global
var convidado: Convidado = Convidado()
//Instância de uma lista mutável vazia
var listaConvidados : MutableList<Convidado> = mutableListOf<Convidado>()

fun main() {
    menuConvidado()
}

private fun menuConvidado() {
    do {
        println("--- MENU ---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("5- BUSCA")
        println("0- SAIR")

        val opcao = readln()() //Validar

        if (expressaoRegular.matches(opcao)) {
            when (opcao.toInt()) {
                1 -> {
                    print("Cadastrando...")
                    cadastrar()
                }

                2 -> {
                    print("Listando...")
                    listar()
                }

                3 -> {
                    print("Editando...")
                    editar()
                }

                4 -> {
                    print("Excluindo...")
                    excluir()
                }

                5 -> {
                    print("Buscando...")
                    busca()
                }

                0 -> {
                    print("Saindo...")
                }
            }
        }
    } while (opcao !=)
}
private fun menu(){

    //QUESTÃO 1 - Valida para que o usuário
}

private fun cadastrar() {
    /*var nome: String = ""
    * var presente: String = ""
    * var alimentar: String = ""*/
    var convidado = Convidado()

    print("Qual o seu nome?")
    //val nome = readln()
    convidado.nome = readln()//Questão 1

    print("Qual vai ser o presente?")
    //val presente = readln()
    convidado.presente = readln()

    print("Qual a sua restrição alimentar?")
    //val alimento = readln()
    convidado.alimentar = readln()

    listaConvidados.add(0, convidado)
}

private fun listar() : String {
    var i = 0
    if (validar()) {
        if (listaConvidados.isEmpty()) {
            println("Não há convidados")
            listaConvidados.forEach { convidado ->
                print(
                    "Posição ${i++}" +
                    "Nome: ${convidado.nome}; " +
                            "Presente: ${convidado.presente} ; " +
                            "Restrição: ${convidado.alimentar};" +
                            "Vai ir pra  festa? ${convidado.presenca} \n"
                )//fim do print
            }//fim do foreach
        }//fim do if
    }
    return "Listagem foi um sucesso" //esse é o meu retorna da função
}

/*QUESTÃO 2 - Validar para que a variavel posição*/
private fun editar() : Boolean {
    if (validar()) {
        listar()
        println("Digite a posição a ser editada: ")
        val posicao = readln().toInt()

        println("O convidado vai? S/N")
        val resposta = readln()
        when (resposta) {
            "S" -> listaConvidados[posicao].presenca = true
            "N" -> listaConvidados[posicao].presenca = false
        }
    }
    return true
}

private fun excluir(): Boolean{
    if(listaConvidados.isEmpty()) {
        listar()

        println("Qual posição você deseja remover: ")
        val posicao = readln().toInt()
        listaConvidados.removeAt(posicao)

        println("Convidado excluido")
    }//fim if
    return true
}//fim excluir


private fun busca(){
    var i = 0//indice da lista
    print("Digite o nome da pessoa que você busca: ")
    val busca = readln()
    listaConvidados.forEach { convidado ->
        //O contains  busca por uma string dentro de uma outra string
        if (convidado.nome.contains(busca)){
            println(convidado.nome)
        }
        i++
    }
}
private fun validar() : Boolean{
    if (listaConvidados.isEmpty()){
        println("Lista vazia! Finalizando...")
        return false
    }
    return true
}



