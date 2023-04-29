import java.util.Date;

enum Escolaridade {
    SUPERIOR,
    ESPECIALIZACAO,
    MESTRADO,
    DOUTORADO
}

public class Professor {
    String nome;
    String matricula;
    Date dataNascimento;
    double salario;
    Escolaridade nivelEscolaridade;
    String disciplina;

    public void lecionar() {
        System.out.println("Professor está passando aula!");
    }


    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public Escolaridade getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNivelEscolaridade(Escolaridade nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
