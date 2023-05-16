package imd.ufrn.br.modelo;

public class SeguroVida implements ITributavel {
    protected int numero;
    protected String beneficiado;
    protected double valor;
    protected double taxa;

    @Override
    public double calcularTributos() {
        return 31.50;
    }

    public int getNumero() {
        return numero;
    }

    public String getBeneficiado() {
        return beneficiado;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}

