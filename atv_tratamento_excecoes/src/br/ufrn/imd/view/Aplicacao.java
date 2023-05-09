package br.ufrn.imd.view;

import br.ufrn.imd.exceptions.PistaException;
import br.ufrn.imd.sistema.Pista;

public class Aplicacao {
    Pista pista;
    public Aplicacao(){
        this.pista = new Pista();
    }
    public void executar() {
        try {
            this.pista.iniciar(400);
        } catch (PistaException err) {
            // err.printStackTrace();
            System.out.println("Pista foi bloqueada");
        }
    }
}
