import java.util.*

class Recepcionista(matricula: String?, nome: String?) : Funcionario(matricula, nome) {
    val horarios: HashSet<Horario>

    init {
        horarios = HashSet()
    }

    fun addHorario(horario: Horario) {
        horarios.add(horario)
    }

    fun removeHorario(horario: Horario) {
        horarios.remove(horario)
    }

    override val tipoFuncionario: String
        get() = "imd.academia.Recepcionista"
    val horariosPrint: String
        get() {
            val horarios_str = StringJoiner(", ")
            for (horario in horarios) {
                horarios_str.add(horario.toString())
            }
            return "{ ${ horarios_str.toString() } }"
        }
}
