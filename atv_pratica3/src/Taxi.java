public class Taxi extends Veiculo  {
    int espacoPassageiros;

    public String getTipo() {
        return "TAXI";
    }

    @Override
    public double getCarbonFootprint() {
        return this.quiloMensal * 1.10;
    }

    public void setEspacoPassageiros(int espacoPassageiros) {
        this.espacoPassageiros = espacoPassageiros;
    }

    public int getEspacoPassageiros() {
        return espacoPassageiros;
    }
}
