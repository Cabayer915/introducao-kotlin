fun main() {
    val idadeTxt = "33"

    // no kotlin, String tem metodos de conversão EMBARCADOS
    val idade:Int = idadeTxt.toInt()
    val altura:Double = "1.88".toDouble()

    print("idade: $idade\n")
    print("altura: $altura\n")

    /*
    Multiline String: basta usar """ (3 aspas duplas)
    Para ignorar a primeira e a ultima quebra de linha
    e os espaços antes das linhas, usamos .trimIndent()
    */
    val meuSql = """
        select * from tabela
        where campo = 'teste'
        """.trimIndent()
    println(meuSql)
}