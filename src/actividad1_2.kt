fun main() {
    var num1: Int = 10
    var num2: Int = 20

    println("Antes del intercambio: num1 = $num1, num2 = $num2")

    num1 = num2.also { num2 = num1 }

    println("Después del intercambio: num1 = $num1, num2 = $num2")
}