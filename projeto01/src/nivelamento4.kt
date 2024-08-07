fun main() {
    val idade = 30

    /*
    Substituto dos ternarios
     */
    println(if (idade > 18) "Maior de idade" else "Menor de idade")

    /*
    Usando when para executar instruções
     */
    when (idade) {
        in 1..3 -> println("Bebezinho")
        in 4..14 -> println("Criançinha")
        in 15..18 -> println("Adolescente")
        in 19..21 -> {
            println("Quase adulto")
            println("Mas, muito folgado.")
        }
        in 22..100 -> println("Adulto")
        else -> println("Idade inválida")
    }

    // when pode se enquadrar dentro de variaveis
    var resultado  =     when (idade) {
        in 1..3 -> println("Bebezinho")
        in 4..14 -> println("Criançinha")
        in 15..18 -> println("Adolescente")
        in 19..21 -> {
            println("Quase adulto")
            println("Mas, muito folgado.")
        }
        in 22..100 -> println("Adulto")
        else -> println("Idade inválida")
    }
}