import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.StringJoiner;

public class Aluno {
    private String cpf;
    private String nome;
    private Date nascimento;

    private HashSet<Horario> treinos;

    public Aluno(String cpf, String nome, Date nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.treinos = new HashSet<>();
    }

    public String getTreinosPrint(){
        StringJoiner horarios_str = new StringJoiner(", ");
        for (Horario treino : this.treinos) {
            horarios_str.add(treino.toString());
        }
        return String.format("{ %s }", horarios_str.toString());
    }

    public void addTreino(Horario treino){
        this.treinos.add(treino);
    }

    public void removeTreino(Horario treino){
        this.treinos.remove(treino);
    }

    public HashSet<Horario> getTreinos() {
        return treinos;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
