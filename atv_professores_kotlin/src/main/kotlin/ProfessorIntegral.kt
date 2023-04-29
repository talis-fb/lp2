import java.util.*

class ProfessorIntegral : Professor() {
    var dataInicio: Date? = null

    override fun lecionar() {
        println("Professor integral está passando aula!")
    }
}
