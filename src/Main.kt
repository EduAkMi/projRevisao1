fun main() {
//    val p1 = Pessoa(15, "Joao", "Paulo", "11111")
//    p1.escrevaRG()
//
//    val carla = Pedreiro(10, 40, "Carla", "Henrique", "22222")
//    println("${carla.nome} ${carla.sobrenome} tem ${carla.idade} anos")
    val arnaldo = Cliente(35, "Arnaldo", "123123123")
    val contaDoArnaldo = ContaPoupanca(arnaldo, 2, 10000)
    contaDoArnaldo.fazerDeposito(100)
}

class Cliente(val idade: Int, val nome: String, val cpf: String)

open class Conta(val cliente: Cliente, var saldo: Int) {
    open fun fazerDeposito(valorDeposito: Int) {
        saldo += valorDeposito
    }

    fun sacarDinheiro() {
    }

    fun consultarSaldo() {
    }
}

class ContaPoupanca(clienteContaPoupanca: Cliente, val taxaJuros: Int, saldo:Int) : Conta(clienteContaPoupanca, saldo) {
    fun debitaTaxaJuros() {
        saldo *= taxaJuros
        println("Seu novo saldo é de $saldo")
    }

    override fun fazerDeposito(valorDeposito: Int) {
        saldo += valorDeposito + taxaJuros
        println("${cliente.nome} depositou $valorDeposito. Agora ele tem o saldo de $saldo")
    }
}


open class Pessoa(val idade: Int, val nome: String, val sobrenome: String, val rg: String) {
    fun escrevaRG() {
        println(rg)
    }

    fun escrevaIdade() {
        println(idade)
    }
}

class Pedreiro(val anosAtuacao: Int, ida: Int, nome: String, ultimoNome: String, rg: String) :
    Pessoa(ida, nome, ultimoNome, rg)