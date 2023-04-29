import java.util.Date;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Horistas
        ProfessorHorista julio = new ProfessorHorista();
        julio.setNome("Julio Cesar");
        julio.setDataNascimento(new Date(1999, 4, 15));
        julio.setDisciplina("MATEMATICA");
        julio.setMatricula("2021932");
        julio.setNivelEscolaridade(Escolaridade.MESTRADO);
        julio.setHorasTrabalhadas(10);

        ProfessorHorista maria = new ProfessorHorista();
        maria.setNome("Maria Cavalcante");
        maria.setDataNascimento(new Date(1987, 7, 10));
        maria.setDisciplina("MATEMATICA");
        maria.setMatricula("202143232");
        maria.setNivelEscolaridade(Escolaridade.DOUTORADO);
        maria.setHorasTrabalhadas(30);

        ProfessorHorista rogerio = new ProfessorHorista();
        rogerio.setNome("Rogerio Lucio");
        rogerio.setDataNascimento(new Date(1977, 1, 20));
        rogerio.setDisciplina("HISTORIA");
        rogerio.setMatricula("20223143232");
        rogerio.setNivelEscolaridade(Escolaridade.ESPECIALIZACAO);
        rogerio.setHorasTrabalhadas(35);

        ProfessorHorista gabriel = new ProfessorHorista();
        gabriel.setNome("Gabriel Ducena");
        gabriel.setDataNascimento(new Date(2001, 10, 10));
        gabriel.setDisciplina("INGLES");
        gabriel.setMatricula("201943232");
        gabriel.setNivelEscolaridade(Escolaridade.DOUTORADO);
        gabriel.setHorasTrabalhadas(30);

        // Integral
        ProfessorIntegral francisco = new ProfessorIntegral();
        francisco.setNome("Francisco Almeida");
        francisco.setDataNascimento(new Date(1978, 12, 1));
        francisco.setDisciplina("FISICA");
        francisco.setMatricula("201743232");
        francisco.setNivelEscolaridade(Escolaridade.SUPERIOR);
        francisco.setDataInicio(new Date(2017, 1, 1));
        francisco.setSalario(2000.00);

        ProfessorIntegral silvia = new ProfessorIntegral();
        silvia.setNome("Silvia Dolores");
        silvia.setDataNascimento(new Date(1969, 9, 2));
        silvia.setDisciplina("SOCIOLOGIA");
        silvia.setMatricula("201443232");
        silvia.setNivelEscolaridade(Escolaridade.SUPERIOR);
        silvia.setDataInicio(new Date(2014, 1, 1));
        silvia.setSalario(1500.00);

        ProfessorIntegral samuel = new ProfessorIntegral();
        samuel.setNome("Samuel olacio");
        samuel.setDataNascimento(new Date(2000, 4, 27));
        samuel.setDisciplina("PORTUGUES");
        samuel.setMatricula("201743232");
        samuel.setNivelEscolaridade(Escolaridade.SUPERIOR);
        samuel.setDataInicio(new Date(2019, 2, 1));
        samuel.setSalario(2000.00);

        ProfessorIntegral fernanda = new ProfessorIntegral();
        fernanda.setNome("Fernanda Almeida");
        fernanda.setDataNascimento(new Date(1978, 12, 1));
        fernanda.setDisciplina("GEOGRAFIA");
        fernanda.setMatricula("201743232");
        fernanda.setNivelEscolaridade(Escolaridade.MESTRADO);
        fernanda.setDataInicio(new Date(2017, 1, 1));
        fernanda.setSalario(4000.00);


        HashSet<Professor> professores = new HashSet<>();
        professores.add(julio);
        professores.add(maria);
        professores.add(rogerio);
        professores.add(gabriel);

        professores.add(francisco);
        professores.add(silvia);
        professores.add(samuel);
        professores.add(fernanda);


        ProfessorDAO repo = new ProfessorDAO(professores);
        EscolaView escola = new EscolaView(repo);

        System.out.println(" >>>> Relatorios...");
        System.out.println(" -- Professores Matematica & Portugues --");
        escola.printProfessoresMatematicaPortugues();

        System.out.println(" -- Horas Trabalhadas --");
        escola.printHorasTrabalhadas();

        System.out.println(" -- Salario a serem pagos --");
        escola.printSalariosSeremPagos();

        System.out.println(" -- Mestrado e Doutorado --");
        escola.printProfessoresMestradoDoutorado();

        System.out.println(" ------------------------");
        System.out.println(" >>>> Detalhes de professores...");

        System.out.println(" -- Professor com uma mercedes na garagem --");
        Professor rico = escola.getProfessorMaiorSalario();
        System.out.println(String.format("%s | %s | %s, R$ %s", rico.getNome(), rico.getMatricula(), rico.getDisciplina(), rico.getSalario()));

        System.out.println(" -- Professor com mais estrada aqui --");
        Professor anciao = escola.getProfessorMaiorAntigo();
        System.out.println(String.format("%s | %s | %s, R$ %s", anciao.getNome(), anciao.getMatricula(), anciao.getDisciplina(), anciao.getSalario()));

        System.out.println(" -- Professor com mais espilhas na cara --");
        Professor jovem = escola.getProfessorMaisJovem();
        System.out.println(String.format("%s | %s | %s, R$ %s", jovem.getNome(), jovem.getMatricula(), jovem.getDisciplina(), jovem.getSalario()));

    }
}