enum class TipoProfessor {
    MUSCULAÇÃO,
    NATAÇÃO
}

class Professor(matricula: String?, nome: String?, var tipo: TipoProfessor) : Funcionario(
    matricula,
    nome
) {
    private val alunos: HashSet<Aluno>

    init {
        alunos = java.util.HashSet<Aluno>()
    }

    override val tipoFuncionario: String
        get() = String.format("imd.academia.Professor [%s]", tipo.toString())

    fun addAluno(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun removeAluno(aluno: Aluno) {
        alunos.remove(aluno)
    }

    fun getAlunos(): HashSet<Aluno> {
        return alunos
    }
}
