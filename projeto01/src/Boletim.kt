class Boletim(var estudante: String,
              var nota1: Double,
              var nota2: Double)
{
    init {
        if (nota1 !in 0.0..10.0) {
            println("Nota inválida: $nota1. Deve estar entre 0.0 e 10.0.")
            nota1 = 0.0
        }

        if (nota2 !in 0.0..10.0) {
            println("Nota inválida: $nota2. Deve estar entre 0.0 e 10.0.")
            nota2 = 0.0
        }
    }

    fun calcularMedia(): Double {
        return (nota1 + nota2) / 2
    }

    fun obterResultado(): String {
        val media = calcularMedia()
        return when {
            media < 5 -> "Reprovação"
            media < 6 -> "Recuperação"
            else -> "Aprovação"
        }
    }
}