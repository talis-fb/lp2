enum TipoPartida {
    ELETRICA,
    MANUAL
}

public class Moto extends Veiculo {
    private TipoPartida partida;
    private int cilidradas;


    public Moto() {
        super();
        this.cilidradas = 0;
        this.partida = TipoPartida.MANUAL;
    }


    public TipoPartida getPartida() {
        return partida;
    }


    @Override
    public String getTipo() {
        return "Moto";
    }

    public int getCilidradas() {
        return cilidradas;
    }

    public void setPartida(TipoPartida partida) {
        this.partida = partida;
    }

    public void setCilidradas(int cilidradas) {
        this.cilidradas = cilidradas;
    }
}
