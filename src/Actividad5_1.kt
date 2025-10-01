class Actividad5_1(val titular: String, var saldo: Double) {
    fun mostrar() {
        println("Titular: $titular")
        println("Saldo: $saldo")
    }

    fun ingresar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Se ha ingresado  $cantidad € a la cuenta. Saldo actual =$saldo €")
        } else {
            println("no se puede retirar esa cantidad de ")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Se han retirado $cantidad saldo acutal $saldo")
        } else {
            println("Saldo insuficiente")
        }
    }
}
fun main (){
    val cuenta = Actividad5_1("Ana", 100.0)
    println("El titular de la cuenta es: ${cuenta.titular}, el saldo inicial es: ${cuenta.saldo}" )
    cuenta.ingresar(60.0)
    cuenta.retirar(30.0)
    cuenta.retirar(20.0)

}