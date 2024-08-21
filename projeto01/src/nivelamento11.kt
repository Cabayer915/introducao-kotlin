fun main() {
    val bairro1 = Bairro()
    bairro1.nome = "centro"
    bairro1.populacao = 10000

    val bairro2 = Bairro()
    bairro2.nome = "centro"
    bairro2.populacao = 10000

    println(bairro1 == bairro2)

    val cidade = Cidade("São Paulo", 12_000_000)

    val cidade2 = Cidade("São Paulo", 12_000_000)

    println(cidade == cidade2)
}