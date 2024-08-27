import java.util.Scanner

fun main() {
    val leitor = Scanner(System.`in`)

    println("Digite a quantidade de boletins a serem cadastrados:")
    val quantidade = leitor.nextInt()
    leitor.nextLine()

    val boletins = mutableListOf<Boletim>()

    for (i in 1..quantidade) {
        println("Digite o nome do estudante:")
        val estudante = leitor.nextLine()

        println("Digite a primeira nota:")
        val nota1 = leitor.nextDouble()

        println("Digite a segunda nota:")
        val nota2 = leitor.nextDouble()
        leitor.nextLine()

        val boletim = Boletim(estudante, nota1, nota2)
        boletins.add(boletim)
    }

    println("\nRelatório de Boletins:")

    for (boletim in boletins) {
        if (boletim.estudante.isNotEmpty()) {
            println("Estudante: ${boletim.estudante}")
            println("Média: %.2f".format(boletim.calcularMedia()))
            println("Resultado: ${boletim.obterResultado()}\n")
        }
    }
}