lateinit var usuarioSessao:String

fun main() {
    // nn é possivel atribuir atribuir null em tipos comuns no Kotlin
    // var nome:String = null

    var cep:String = "01155999"
    var nome:String? = null
    var nomes:String = " "

    println(cep.uppercase())
    println(nome?.uppercase()) // ignorar se for full
    // println(nome!!.uppercase()) // aceitar a NullPointerException

    usuarioSessao = "Gaucho"
    println("usuario da sessão: $usuarioSessao")
}