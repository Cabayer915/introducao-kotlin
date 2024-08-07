fun main() {
    comprimentar("Edenilson")

    println(beneficio("Layla", 9))
}

/*
Essa função tem um parametro
e NÃO tem retorno
*/

/*
parametros no Kotlin são imutáveis
*/

fun comprimentar(pessoa:String) {
    // pessoa = "Marquinhos"
    println("Eae, $pessoa, Ce tá bem guri?")
}

/*
Essa função tem dois parametro
e NÃO tem retorno
*/

fun diaHora(dia:Int, hora:Int) {
    println("Hoje é dia $dia e são $hora")
}

/*
Essa função tem dois parametro
e TEM retorno de String
*/

fun beneficio(nome:String, filhos:Int):String {
    var valor = filhos*25
    return "Olá, $nome. Seu benefício será de R$$valor"
}