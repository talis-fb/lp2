package br.ufrn.imd;

import java.util.Date;

public class Girafa extends Animal {
    public Girafa(String nome, int peso, String alimentacao, Date dataNascimento) {
        super(nome, peso, alimentacao, dataNascimento);
    }

    @Override
    public void comer() {
        double necessarioComer = this.getPeso() * 0.1;
        System.out.println(String.format("O animal %s precisa comer %s de %s", this.nome, necessarioComer, this.alimentacao));
        this.alimentado = true;
    }

    protected int tamanhoLingua;

    public int getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(int tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
    }
}
