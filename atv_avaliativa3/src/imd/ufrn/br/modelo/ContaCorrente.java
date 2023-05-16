package imd.ufrn.br.modelo;

public class ContaCorrente implements ITributavel {
    String agencia;
    String numero;
    double saldo;

    @Override
    public double calcularTributos() {
        return this.saldo * 0.38;
    }

    public boolean sacar(double valor) {
        boolean tem_dinheiro = false;
        if (this.saldo >= valor) {
            tem_dinheiro = true;
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " em [" + this.numero + "] efetuado com sucesso");
        } else {
            tem_dinheiro = false;
            System.out.println("Saldo insuficiente ou valor menor que 0");
        }

        return tem_dinheiro;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " em [" + this.numero + "] efetuado com sucesso");
    }

    public boolean transferir(double valor, ContaCorrente cc){
        System.out.println("Transferindo " + valor + " para [" + cc.getNumero() +"]");
        boolean tem_dinheiro = this.sacar(valor);

        if (tem_dinheiro) {
            cc.depositar(valor);
        }

        return tem_dinheiro;
    }


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
