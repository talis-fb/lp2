import java.util.ArrayList;
import java.util.HashSet;

enum TipoProfessor {
    MUSCULAÇÃO,
    NATAÇÃO,
}

public class Professor extends Funcionario {
    private TipoProfessor tipo;
    private HashSet<Aluno> alunos;

    public Professor(String matricula, String nome, TipoProfessor tipo){
        super(matricula, nome);
        this.tipo = tipo;
        this.alunos = new HashSet<Aluno>();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public HashSet<Aluno> getAlunos() {
        return alunos;
    }

    public void setTipo(TipoProfessor tipo) {
        this.tipo = tipo;
    }

    public TipoProfessor getTipo() {
        return tipo;
    }
}
