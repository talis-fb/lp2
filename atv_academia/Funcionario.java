public class Funcionario {
    private String matricula;
    private String nome;

    public Funcionario(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoFuncionario(){
        return "imd.academia.Funcionario";
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
