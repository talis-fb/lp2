import java.util.Date;

public class Elefante extends Animal {

    public Elefante(String nome, int peso, String alimentacao, Date dataNascimento) {
        super(nome, peso, alimentacao, dataNascimento);
    }

    @Override
    public void comer() {
        double necessarioComer = this.getPeso() * 0.15;
        System.out.println(String.format("O animal %s precisa comer %s de %s", this.nome, necessarioComer, this.alimentacao));
        this.alimentado = true;
    }

    protected int tamanhoTromba;

    public int getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }
}
