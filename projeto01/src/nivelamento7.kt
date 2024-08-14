fun main() {

    // aqui criamos uma LISTA
    val campeoes = listOf("Guri", "Piá", "Djanho")
    println(campeoes.count())
    println(campeoes)

    // nn podemos mexer nos items. por isso as linhas abaixo NÃO compilam!
    // campeoes.add("Gremista")
    // campeoes.remove("Gremista")

    // lista MUTÁVEL
    val bagagem = mutableListOf("Roupas", "Eletronicos", "Documentos")

    bagagem.add("Malas")
    bagagem.remove("Roupas")

    println(bagagem.count())
    println(bagagem)

    // lista vazia
    val mundiaisDoPalmeiras = mutableListOf<String>()

    println("2o elemento: ${campeoes[1]}")
    println("3o elemento: ${campeoes[2]}")
    println("1o elemento: ${campeoes.first()}")
    println("último elemento: ${campeoes.last()}")

    // reatribuindo valor na position 1
    bagagem[1] = "Barriga Verde"

    bagagem.forEach {
        println("Item de bagagem: $it")
    }

    // o count não é tão performatico quanto o size
    println(bagagem.count())
    println(bagagem.size)

    val racas = listOf("lulu", "pincher", "golden", "fila", "dogo")
    println("Raças com a letra i: " + racas.count() { it.contains("i")})

    println("Raças com mais de 6 letras: " + racas.count{ it.length > 6 })

    // filter > retorna uma lista a partir da original de acordo com o criterio
    println(racas.filter{ it.contains("n")})

    // clear remove todos os itens da lista
    bagagem.clear()
    println(bagagem)

}