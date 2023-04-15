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
        val linhas = funcionarios.map {
            "Matricula ${it.matricula} \t Nome: ${it.nome} \t Tipo: ${it.tipoFuncionario}"
        }

        println("####### Funcionários #######################")
        linhas.forEach {
            println(it)
        }
        println("############################################")
    }

    fun imprimirProfessores() {
        val professores = funcionarios.filterIsInstance<Professor>()

        println("####### Professores ########################")
        professores.forEach {
            println(" Professor ${it.nome}")
            it.getAlunos().forEach {
                println(" Aluno >>> ${it.nome} ${it.treinosPrint}")
            }
        }
        println("############################################")
    }

    fun imprimirRecepcionistas() {
        val recepcionista = funcionarios.filterIsInstance<Recepcionista>()

        println("####### Recepcionista ########################")
        recepcionista.forEach {
            println(" Nome : [${it.nome}] ${it.horariosPrint}")
        }
        println("############################################")
    }
}
