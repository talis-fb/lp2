public class Carro extends Veiculo {
    double motor;

    public String getTipo() {
        return "CARRO";
    }

    @Override
    public double getCarbonFootprint() {
        if (this.motor > 2.0) {
            return this.quiloMensal * 1.85;
        }
        if (this.motor < 0.13) {
            return this.quiloMensal * 0.13;
        }

        return this.quiloMensal * 1.22;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public double getMotor() {
        return motor;
    }
}
