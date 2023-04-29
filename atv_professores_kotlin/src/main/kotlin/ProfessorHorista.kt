class ProfessorHorista : Professor() {
    var horasTrabalhadas = 0

    override fun lecionar() {
        println("Professor horista está passando aula!")
    }

    override var salario: Double
        get() = horasTrabalhadas * VALOR_HORA
        set(salario) {
            super.salario = salario
        }

    companion object {
        const val VALOR_HORA = 25.00
    }
}
