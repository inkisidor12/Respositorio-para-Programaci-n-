fun sumar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    print("Introduce el primer número: ")
    //!!.toInt() es algo para convertirlo en int y el !!para asumir que no es nulo
    // el readLine es como el scanner de java  para recordar
    val numero1 = readLine()!!.toInt()

    print("Introduce el segundo número: ")
    val numero2 = readLine()!!.toInt()

    val resultado = sumar(numero1, numero2)
    println("La suma de $numero1 y $numero2 es $resultado")
}

