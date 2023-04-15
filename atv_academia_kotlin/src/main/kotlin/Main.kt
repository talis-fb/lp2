import java.util.*

fun main(args: Array<String>) {
    val recep1 = Recepcionista("001", "Jessica")
    recep1.addHorario(Horario(Date(2023, 4, 15, 12, 30, 0), "Terça"))
    recep1.addHorario(Horario(Date(2023, 4, 15, 12, 30, 0), "Quarta"))

    val recep2 = Recepcionista("001", "Amanda")
    recep2.addHorario(Horario(Date(2023, 4, 15, 12, 30, 0), "Sexta"))
    recep2.addHorario(Horario(Date(2023, 4, 15, 12, 30, 0), "Quarta"))

    val prof1 = Professor("003", "Snape", TipoProfessor.MUSCULAÇÃO)
    val prof2 = Professor("004", "Dumbledore", TipoProfessor.NATAÇÃO)

    // Alunos musculação -----------

    // Alunos musculação -----------
    val aluno1 = Aluno("702.654.32-22", "Joao", Date())
    aluno1.addTreino(Horario(Date(2023, 4, 15, 12, 30, 0), "Supino Reto"))
    aluno1.addTreino(Horario(Date(2023, 4, 14, 13, 0, 0), "Supino Inclinado"))

    val aluno2 = Aluno("893.474.44-00", "Maria", Date())
    aluno2.addTreino(Horario(Date(2023, 4, 15, 15, 30, 0), "Peck Deck"))
    aluno2.addTreino(Horario(Date(2023, 4, 14, 18, 0, 0), "Crucifixo"))

    val aluno3 = Aluno("132.474.44-00", "Eduardo", Date())
    aluno3.addTreino(Horario(Date(2023, 4, 15, 8, 30, 0), "Elevação Lateral"))
    aluno3.addTreino(Horario(Date(2023, 4, 14, 10, 0, 0), "Rosca Direta"))

    // Alunos natação ---------------

    // Alunos natação ---------------
    val aluno4 = Aluno("003.654.77-00", "Eliza", Date())
    aluno4.addTreino(Horario(Date(2023, 4, 15, 7, 30, 0), "Alongamento"))
    aluno4.addTreino(Horario(Date(2023, 4, 14, 11, 0, 0), "Borboleta"))

    val aluno5 = Aluno("003.654.77-00", "Luiza", Date())
    aluno5.addTreino(Horario(Date(2023, 4, 15, 5, 30, 0), "Nadar direito"))
    aluno5.addTreino(Horario(Date(2023, 4, 14, 11, 0, 0), "Nadar"))


    prof1.addAluno(aluno1)
    prof1.addAluno(aluno2)
    prof1.addAluno(aluno3)
    prof2.addAluno(aluno4)
    prof2.addAluno(aluno5)


    val academia = NatalFitness(BancoDeDados())

    academia.addFuncionario(recep1)
    academia.addFuncionario(recep2)
    academia.addFuncionario(prof1)
    academia.addFuncionario(prof2)

    // Output

    // Output
    academia.imprimirFuncionarios()
    println("\n")
    academia.imprimirProfessores()
    println("\n")
    academia.imprimirRecepcionistas()
}