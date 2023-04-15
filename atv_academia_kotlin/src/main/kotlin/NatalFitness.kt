class NatalFitness(var db: BancoDeDados) {
    fun addFuncionario(funcionario: Funcionario?) {
        db.addFuncionarios(funcionario!!)
    }

    fun imprimirFuncionarios() {
        db.imprimirFuncionarios()
    }

    fun imprimirProfessores() {
        db.imprimirProfessores()
    }

    fun imprimirRecepcionistas() {
        db.imprimirRecepcionistas()
    }
}
