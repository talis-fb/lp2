public class Moto extends Veiculo {
    int cilindrada;

    public String getTipo() {
        return "MOTO";
    }

    @Override
    public double getCarbonFootprint() {
        if (this.cilindrada > 650) {
            return this.quiloMensal * 0.65;
        }
        if (this.cilindrada < 150) {
            return this.quiloMensal * 0.20;
        }

        return this.quiloMensal * 0.50;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
