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
                            " Matrícula: %s Nome: %s Tipo: %s",
                            funcionario.getMatricula(),
                            funcionario.getNome(),
                            funcionario
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
}
