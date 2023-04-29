import java.util.*

fun main(args: Array<String>) {
    // Horistas
    val julio = ProfessorHorista()
    julio.nome = "Julio Cesar"
    julio.dataNascimento = Date(1999, 4, 15)
    julio.disciplina = "MATEMATICA"
    julio.matricula = "2021932"
    julio.nivelEscolaridade = Escolaridade.MESTRADO
    julio.horasTrabalhadas = 10

    val maria = ProfessorHorista()
    maria.nome = "Maria Cavalcante"
    maria.dataNascimento = Date(1987, 7, 10)
    maria.disciplina = "MATEMATICA"
    maria.matricula = "202143232"
    maria.nivelEscolaridade = Escolaridade.DOUTORADO
    maria.horasTrabalhadas = 30

    val rogerio = ProfessorHorista()
    rogerio.nome = "Rogerio Lucio"
    rogerio.dataNascimento = Date(1977, 1, 20)
    rogerio.disciplina = "HISTORIA"
    rogerio.matricula = "20223143232"
    rogerio.nivelEscolaridade = Escolaridade.ESPECIALIZACAO
    rogerio.horasTrabalhadas = 35

    val gabriel = ProfessorHorista()
    gabriel.nome = "Gabriel Ducena"
    gabriel.dataNascimento = Date(2001, 10, 10)
    gabriel.disciplina = "INGLES"
    gabriel.matricula = "201943232"
    gabriel.nivelEscolaridade = Escolaridade.DOUTORADO
    gabriel.horasTrabalhadas = 30

    // Integral
    val francisco = ProfessorIntegral()
    francisco.nome = "Francisco Almeida"
    francisco.dataNascimento = Date(1978, 12, 1)
    francisco.disciplina = "FISICA"
    francisco.matricula = "201743232"
    francisco.nivelEscolaridade = Escolaridade.SUPERIOR
    francisco.dataInicio = Date(2017, 1, 1)
    francisco.salario = 2000.00

    val silvia = ProfessorIntegral()
    silvia.nome = "Silvia Dolores"
    silvia.dataNascimento = Date(1969, 9, 2)
    silvia.disciplina = "SOCIOLOGIA"
    silvia.matricula = "201443232"
    silvia.nivelEscolaridade = Escolaridade.SUPERIOR
    silvia.dataInicio = Date(2014, 1, 1)
    silvia.salario = 1500.00

    val samuel = ProfessorIntegral()
    samuel.nome = "Samuel olacio"
    samuel.dataNascimento = Date(2000, 4, 27)
    samuel.disciplina = "PORTUGUES"
    samuel.matricula = "201743232"
    samuel.nivelEscolaridade = Escolaridade.SUPERIOR
    samuel.dataInicio = Date(2019, 2, 1)
    samuel.salario = 2000.00

    val fernanda = ProfessorIntegral()
    fernanda.nome = "Fernanda Almeida"
    fernanda.dataNascimento = Date(1978, 12, 1)
    fernanda.disciplina = "GEOGRAFIA"
    fernanda.matricula = "201743232"
    fernanda.nivelEscolaridade = Escolaridade.MESTRADO
    fernanda.dataInicio = Date(2017, 1, 1)
    fernanda.salario = 4000.00

    val professores = HashSet<Professor>()
    professores.add(julio)
    professores.add(maria)
    professores.add(rogerio)
    professores.add(gabriel)
    professores.add(francisco)
    professores.add(silvia)
    professores.add(samuel)
    professores.add(fernanda)

    val escola = Repo(professores)

    println(" >>>> Relatorios...")

    println(" -- Professores Matematica & Portugues --")
    escola.printProfessoresMatematicaPortugues()

    println(" -- Horas Trabalhadas --")
    escola.printHorasTrabalhadas()

    println(" -- Salario a serem pagos --")
    escola.printSalariosSeremPagos()

    println(" -- Mestrado e Doutorado --")
    escola.printProfessoresMestradoDoutorado()

    println(" ------------------------")

    println(" >>>> Detalhes de professores...")

    println(" -- Professor com uma mercedes na garagem --")
    val rico = escola.professorMaiorSalario
    println("${rico?.nome} | ${rico?.matricula} | ${rico?.disciplina}, R$ ${rico?.salario}")

    println(" -- Professor com mais estrada aqui --")
    val anciao = escola.professorMaiorAntigo
    println("${anciao?.nome} | ${anciao?.matricula} | ${anciao?.disciplina}, R$ ${anciao?.salario}")

    println(" -- Professor com mais espilhas na cara --")
    val jovem = escola.professorMaisJovem
    println("${jovem?.nome} | ${jovem?.matricula} | ${jovem?.disciplina}, R$ ${jovem?.salario}")
}
