public class EscolaView {
    ProfessorDAO repo;
    public EscolaView(ProfessorDAO repo) {
        this.repo = repo;
    }

    public void addProfessor(Professor prof) {
        this.repo.addProfessor(prof);
    }

    public void removeProfessor(Professor prof) {
        this.repo.removeProfessor(prof);
    }

    public int quantProfessor(Professor prof) {
        return this.repo.quantProfessor(prof);
    }

    public Professor getProfessorMaiorSalario() {
        return this.repo.getProfessorMaiorSalario();
    }

    public Professor getProfessorMaiorAntigo() {
        return this.repo.getProfessorMaiorAntigo();
    }

    public Professor getProfessorMaisJovem() {
        return this.repo.getProfessorMaisJovem();
    }

    public void printSalariosSeremPagos() {
        this.repo.printSalariosSeremPagos();
    }

    public void printHorasTrabalhadas() {
        this.repo.printHorasTrabalhadas();
    }

    public void printProfessoresMatematicaPortugues() {
        this.repo.printProfessoresMatematicaPortugues();
    }

    public void printProfessoresMestradoDoutorado() {
        this.repo.printProfessoresMestradoDoutorado();
    }
}
