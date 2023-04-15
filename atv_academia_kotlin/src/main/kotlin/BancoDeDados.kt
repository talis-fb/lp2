class BancoDeDados {
    private val funcionarios: HashSet<Funcionario>

    init {
        funcionarios = java.util.HashSet()
    }

    fun addFuncionarios(funcionario: Funcionario) {
        funcionarios.add(funcionario)
    }

    fun removeFuncionarios(funcionario: Funcionario) {
        funcionarios.remove(funcionario)
    }

    fun imprimirFuncionarios() {
        val linhas = ArrayList<String>()
        for (funcionario in funcionarios) {
            linhas.add(
                String.format(
                    " Matrícula: %s \t Nome: %s \t Tipo: %s",
                    funcionario.matricula,
                    funcionario.nome,
                    funcionario.tipoFuncionario
                )
            )
        }
        println("####### Funcionários #######################")
        for (content in linhas) {
            println(content)
        }
        println("############################################")
    }

    fun imprimirProfessores() {
        val professores = ArrayList<Professor>()
        for (funcionario in funcionarios) {
            if (funcionario is Professor) {
                professores.add(funcionario)
            }
        }
        println("####### Professores ########################")
        for (prof in professores) {
            println(String.format(" Professor [%s]", prof.nome))
            for (aluno in prof.getAlunos()) {
                println(String.format(" Aluno >>> %s %s", aluno.nome, aluno.treinosPrint))
            }
        }
        println("############################################")
    }

    fun imprimirRecepcionistas() {
        val recepcionista: ArrayList<Recepcionista> = ArrayList<Recepcionista>()
        for (funcionario in funcionarios) {
            if (funcionario is Recepcionista) {
                recepcionista.add(funcionario as Recepcionista)
            }
        }
        println("####### Recepcionista ########################")
        for (recep in recepcionista) {
            println(java.lang.String.format(" Nome : [%s] %s", recep.nome, recep.horariosPrint))
        }
        println("############################################")
    }
}
