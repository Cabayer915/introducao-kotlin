fun main() {
    var contador = 0

    while (contador < 5) {
        contador++
        println("contando: $contador")
    }

    for (contagem in 0..5) {
        println("contagem: $contagem")
    }

    // é possivel interromper os loops com o break
}