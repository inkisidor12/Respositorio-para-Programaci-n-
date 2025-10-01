fun main() {
    val nombres = listOf("Ana", "Pedro", "Luis", "María", "Eva")

    val nombresCortos = nombres.filter { nombre -> nombre.length < 5 }

    println("Nombres originales: $nombres")
    println("Nombres cortos: $nombresCortos")
}