public class Carro extends Veiculo {
    private int quantPortas;

    private int potencia;

    public Carro() {
        super();
        this.quantPortas = 0;
        this.potencia = 0;
    }


    public int getQuantPortas() {
        return quantPortas;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
