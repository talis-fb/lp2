import java.util.ArrayList;
import java.util.HashSet;

public class BancoDeDados {
    private HashSet<Funcionario> funcionarios;

    public BancoDeDados(){
        this.funcionarios = new HashSet<>();
    }

    public void addFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionarios(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void imprimirFuncionarios() {
        ArrayList<String> linhas = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios) {
            linhas.add(
                    String.format(
                            " Matrícula: %s \t Nome: %s \t Tipo: %s",
                            funcionario.getMatricula(),
                            funcionario.getNome(),
                            funcionario.getTipoFuncionario()
                    )
            );
        }

        System.out.println("####### Funcionários #######################");
        for (String content : linhas) {
            System.out.println(content);
        }
        System.out.println("############################################");
    }

    public void imprimirProfessores() {
        ArrayList<Professor> professores = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario instanceof Professor){
                professores.add((Professor) funcionario);
            }
        }

        System.out.println("####### Professores ########################");
        for (Professor prof : professores) {
            System.out.println(String.format(" Professor [%s]", prof.getNome()));

            for (Aluno aluno : prof.getAlunos()) {
                System.out.println(String.format(" Aluno >>> %s %s", aluno.getNome(), aluno.getTreinosPrint()));
            }
        }
        System.out.println("############################################");
    }

    public void imprimirRecepcionistas() {
        ArrayList<Recepcionista> recepcionista = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario instanceof Recepcionista){
                recepcionista.add((Recepcionista) funcionario);
            }
        }

        System.out.println("####### Recepcionista ########################");
        for (Recepcionista recep : recepcionista) {
            System.out.println(String.format(" Nome : [%s] %s", recep.getNome(), recep.getHorariosPrint()));
        }
        System.out.println("############################################");
    }
}
