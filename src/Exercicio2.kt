//2) Escreva uma classe que receba uma lista de números e uma função que imprime no console o produto
// ou seja o resultado de multiplicar todos os elementos entre si.
//Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7.

fun main() {
    val number1 = Numbers(listOf(1, 2, 3)) // 6
    val number2 = Numbers(listOf(1, 4, 8)) // 32
    val number3 = Numbers(listOf(5, 4, 10, 2)) // 400
    val number4 = Numbers(listOf(2, 4, 2, 2, 4, 3)) // 384
    number1.multiplyAllItems()
    number2.multiplyAllItems()
    number3.multiplyAllItems()
    number4.multiplyAllItems()
}

class Numbers(val listNumbers: List<Int>) {
    fun multiplyAllItems() {
        var total = 1
        for (x in listNumbers) {
            total *= x
        }
        println(total)
    }
}
