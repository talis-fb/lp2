package br.ufrn.imd.sistema;

import br.ufrn.imd.exceptions.AcimaVelocidadeException;

public class Automovel {
    public static final int VELOCIDADE_MAXIMA = 120;
    int velocidadeAtual = 0;

    void acelerar(int velocidade) throws AcimaVelocidadeException {
        int novaVelocidade = this.velocidadeAtual + velocidade;
        if (novaVelocidade > VELOCIDADE_MAXIMA) {
            throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }


    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
