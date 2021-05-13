//1) Escreva uma classe que receba como parâmetro uma idade, um sexo e os anos de contribuição para a aposentadoria
// e desenvolva uma função que imprime no console verdadeiro ou falso.
//Lembrando que:
//- A idade mínima para mulheres é de 60 anos;
//- A idade mínima para homens é de 65 anos;
//- Em ambos os casos as pessoas devem ter pelo menos 30 anos de contribuição.

fun main() {
    val trab1 = Trabalhadeiro(54, 'M', 40)
    val trab2 = Trabalhadeiro(30, 'F', 15)
    val trab3 = Trabalhadeiro(67, 'F', 33)
    val trab4 = Trabalhadeiro(62, 'M', 36)
    val trab5 = Trabalhadeiro(45, 'F', 30)
    trab1.verificarContribuicao()
    trab2.verificarContribuicao()
    trab3.verificarContribuicao()
    trab4.verificarContribuicao()
    trab5.verificarContribuicao()
}

class Trabalhadeiro(val idade: Int, val sexo: Char, val anos: Int) {
    fun verificarContribuicao() {
        if (anos < 30) {
            println(false)
        } else if(sexo == 'F' && idade > 59){
            println(true)
        } else if(sexo == 'M' && idade > 64){
            println(true)
        } else {
            println(false)
        }
    }
}
//ctrl alt L
