import java.util.HashSet;

public class ProfessorDAO {
    private HashSet<Professor> professores;

    public ProfessorDAO(HashSet<Professor> professores) {
        this.professores = professores;
    }

    public void addProfessor(Professor prof) {
        this.professores.add(prof);
    }

    public void removeProfessor(Professor prof) {
        this.professores.remove(prof);
    }

    public int quantProfessor(Professor prof) {
        return this.professores.size();
    }

    public Professor getProfessorMaiorSalario() {
        Professor selecionado = null;

        for (Professor prof : this.professores) {
            if (selecionado == null || prof.getSalario() > selecionado.getSalario()) {
                selecionado = prof;
            }
        }

        return selecionado;
    }

    public Professor getProfessorMaiorAntigo() {
        ProfessorIntegral selecionado = null;

        for (Professor prof : this.professores) {
            if (prof instanceof ProfessorIntegral) {
                if (selecionado == null ||  ((ProfessorIntegral) prof).getDataInicio().getTime() < selecionado.getDataInicio().getTime()){
                    selecionado = (ProfessorIntegral) prof;
                }
            }
        }

        return selecionado;
    }

    public Professor getProfessorMaisJovem() {
        Professor selecionado = null;

        for (Professor prof : this.professores) {
            if (selecionado == null || prof.getDataNascimento().getTime() > selecionado.getDataNascimento().getTime()){
                selecionado = prof;
            }
        }

        return selecionado;
    }

    public void printSalariosSeremPagos() {
        for (Professor prof : this.professores) {
            System.out.println(String.format("R$ %s, Prof: %s | %s | %s", prof.getSalario(), prof.getNome(), prof.getMatricula(), prof.getDisciplina()));
        }
    }

    public void printHorasTrabalhadas() {
        for (Professor prof : this.professores) {
            if (prof instanceof ProfessorHorista) {
                System.out.println(String.format("Horas %s, Prof: %s | %s | %s", ((ProfessorHorista) prof).getHorasTrabalhadas(), prof.getNome(), prof.getMatricula(), prof.getDisciplina()));
            }
        }
    }

    public void printProfessoresMatematicaPortugues() {
        for (Professor prof : this.professores) {
            if (prof.getDisciplina() == "MATEMATICA" || prof.getDisciplina() == "PORTUGUES") {
                System.out.println(String.format("%s | %s | %s", prof.getNome(), prof.getMatricula(), prof.getDisciplina()));
            }
        }
    }

    public void printProfessoresMestradoDoutorado() {
        for (Professor prof : this.professores) {
            if (prof.getNivelEscolaridade() == Escolaridade.MESTRADO || prof.getNivelEscolaridade() == Escolaridade.DOUTORADO) {
                System.out.println(String.format("%s | %s | %s | %s", prof.getNome(), prof.getMatricula(), prof.getDisciplina(), prof.getNivelEscolaridade()));
            }
        }
    }
}
