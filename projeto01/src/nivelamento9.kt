fun main() {

    // Instanciando objeto no Kotlin
    val investimento1 = Investimento("Poupança", false)
    val investimento2:Investimento = Investimento("FIIs", false)

    println(investimento1.nome)

    // a linha abaixo não compila, pois o atributo nome é val
    // investimento2.nome = "Ações"
    println(investimento2.nome)
}