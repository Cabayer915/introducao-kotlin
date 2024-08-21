class Bairro {
    // aqui temos atributos de instancia
    // porem sem um construtor
    var nome: String? = null
        get() = field?.uppercase()

    // o getter acima é uma função que retorna o valor da propriedade nome
    // mas não altera o valor da propriedade "nome"
    // field é uma palavra que representa o valor da propriedade "nome"

        set(value) {
            if (value !=null && value.length > 3) {
                field = value
            }
        }

    var populacao: Int? = null
    var temParque: Boolean = false

    fun isNobre(): Boolean {
        return populacao != null && populacao!! < 50000 && temParque
    }

    fun getValorMetroQuadrado(): Double {
        return if (temParque) 10_000.0 else 5000.0
    }
}