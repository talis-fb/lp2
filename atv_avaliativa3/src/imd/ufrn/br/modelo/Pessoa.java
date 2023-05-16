package imd.ufrn.br.modelo;

public class Pessoa {
    protected String nome;
    protected double salario;
    protected ContaCorrente conta;
    protected SeguroVida seguro;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }
}
