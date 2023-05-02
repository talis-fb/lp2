import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean alimentado;
    protected String alimentacao;

    public Animal(String nome, int peso, String alimentacao, Date dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.dataNascimento = dataNascimento;
        this.alimentado = false;
    }


    public void comer() {
        double necessarioComer = this.getPeso() * 0.05;
        System.out.println(String.format("O animal %s precisa comer %s de %s", this.nome, necessarioComer, this.alimentacao));
        this.alimentado = true;
    }

    public static int calcularIdade(Animal animal) {
        LocalDate nascimento = animal.getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate hoje = LocalDate.now();
        Period p = Period.between(nascimento, hoje);
        return p.getYears();
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getPeso() {
        return peso;
    }

    public boolean getAlimentado() {
        return alimentado;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }
}
