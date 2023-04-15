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
            val horarios_str = StringJoiner(", ")
            for (treino in treinos) {
                horarios_str.add(treino.toString())
            }
            return String.format("{ %s }", horarios_str.toString())
        }

    fun addTreino(treino: Horario) {
        treinos.add(treino)
    }

    fun removeTreino(treino: Horario) {
        treinos.remove(treino)
    }

}
