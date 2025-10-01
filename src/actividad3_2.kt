fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}

fun main() {
print("Introduce tu edad: ")
    val edad = readLine()!!.toInt()
    if (esMayorDeEdad(edad)) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }
}