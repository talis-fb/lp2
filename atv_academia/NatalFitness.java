public class NatalFitness {
    BancoDeDados db;


    public NatalFitness(BancoDeDados db){
        this.db = db;
    }

    public void addFuncionario(Funcionario funcionario){
        this.db.addFuncionarios(funcionario);
    }

    public void imprimirFuncionarios() {
        this.db.imprimirFuncionarios();
    }
    public void imprimirProfessores() {
        this.db.imprimirProfessores();
    }
    public void imprimirRecepcionistas() {
        this.db.imprimirRecepcionistas();
    }
}
