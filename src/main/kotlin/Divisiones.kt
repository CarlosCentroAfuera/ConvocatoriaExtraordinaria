fun main() {
    var resultado = divide(5,2) // 2.5
    println(resultado)
    resultado = divide(7,3) // 2.333
    println(resultado)
    resultado = divide(8,3) // 2.666
    println(resultado)
    resultado = divide(8,0) // Infinity
    println(resultado)
}

fun divide(num1 : Int, num2 :Int) : Double {
    return num1.toDouble() / num2
}