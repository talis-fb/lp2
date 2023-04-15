import java.util.*

class Aluno(
    var cpf: String, // Getters and Setters
    var nome: String, var nascimento: Date
) {

    val treinos: HashSet<Horario>

    init {
        treinos = HashSet()
    }

    val treinosPrint: String
        get() {
            return treinos.map { it.toString() }.joinToString(separator = ", ")
        }

    fun addTreino(treino: Horario) {
        treinos.add(treino)
    }

    fun removeTreino(treino: Horario) {
        treinos.remove(treino)
    }

}
