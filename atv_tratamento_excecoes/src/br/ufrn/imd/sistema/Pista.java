package br.ufrn.imd.sistema;

import br.ufrn.imd.exceptions.AcimaVelocidadeException;
import br.ufrn.imd.exceptions.PistaException;

public class Pista {
    Automovel auto;

    public void iniciar(int velo) throws PistaException {
        Automovel auto = new Automovel();
        try {
            auto.acelerar(velo);
        } catch (AcimaVelocidadeException err) {
            throw new PistaException(err.getMessage(), err);
        }
        this.auto = auto;
    }
}
