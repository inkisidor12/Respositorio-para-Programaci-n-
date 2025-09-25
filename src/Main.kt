fun main() {
    val nombre: String = "Ana"
    val edad: Int = 25
    val altura: Double = 1.68
    val usaGafas: Boolean = true

    println("Mi nombre es $nombre, tengo $edad años, mido $altura metros y ${if (usaGafas) 
        "uso gafas" else "no uso gafas"}.")
}

