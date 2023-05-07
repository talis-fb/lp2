public class Veiculo implements ICarbonFootprint {
    int quiloMensal;
    double custoCombustivelMensal;

    public String getTipo() {
        return "UNDEFINED";
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }

    public int getQuiloMensal() {
        return quiloMensal;
    }

    public double getCustoCombustivelMensal() {
        return custoCombustivelMensal;
    }

    public void setQuiloMensal(int quiloMensal) {
        this.quiloMensal = quiloMensal;
    }

    public void setCustoCombustivelMensal(double custoCombustivelMensal) {
        this.custoCombustivelMensal = custoCombustivelMensal;
    }
}
