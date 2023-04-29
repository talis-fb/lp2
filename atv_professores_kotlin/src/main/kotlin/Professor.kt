import java.util.*

enum class Escolaridade {
    SUPERIOR,
    ESPECIALIZACAO,
    MESTRADO,
    DOUTORADO
}

open class Professor {
    var nome: String? = null
    var matricula: String? = null
    var dataNascimento: Date? = null
    open var salario = 0.0
    var nivelEscolaridade: Escolaridade? = null
    var disciplina: String? = null

    open fun lecionar() {
        println("Professor está passando aula!")
    }
}
