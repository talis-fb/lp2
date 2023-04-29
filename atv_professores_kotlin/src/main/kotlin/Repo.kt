class Repo(private val professores: HashSet<Professor>) {
    fun addProfessor(prof: Professor) {
        professores.add(prof)
    }

    fun removeProfessor(prof: Professor) {
        professores.remove(prof)
    }

    fun quantProfessor(prof: Professor?): Int {
        return professores.size
    }

    val professorMaiorSalario: Professor?
        get() {
            return professores.maxBy { it.salario }
        }
    val professorMaiorAntigo: Professor?
        get() {
            return professores.filterIsInstance<ProfessorIntegral>().minBy { it.dataInicio!!.time }
        }
    val professorMaisJovem: Professor?
        get() {
            return professores.maxBy { it.dataNascimento!!.time }
        }

    fun printSalariosSeremPagos() {
        professores.forEach {
            println("R$ ${it.salario}, Prof: ${it.nome} | ${it.matricula} | ${it.disciplina}")
        }
    }

    fun printHorasTrabalhadas() {
        professores.filterIsInstance<ProfessorHorista>().forEach {
            println("Horas ${it.horasTrabalhadas}, Prof: ${it.nome} | ${it.matricula} | ${it.disciplina}")
        }
    }

    fun printProfessoresMatematicaPortugues() {
        professores
            .filter { it.disciplina === "MATEMATICA" || it.disciplina === "PORTUGUES" }
            .forEach {
                println("${it.nome} | ${it.matricula} | ${it.disciplina}")
            }
    }

    fun printProfessoresMestradoDoutorado() {
        professores
            .filter { it.nivelEscolaridade === Escolaridade.MESTRADO || it.nivelEscolaridade === Escolaridade.DOUTORADO }
            .forEach {
                println("${it.nome} | ${it.matricula} | ${it.disciplina} | ${it.disciplina}")
            }
    }
}
