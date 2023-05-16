package imd.ufrn.br.dao;

import java.util.ArrayList;

import imd.ufrn.br.controle.GeradorImpostoRenda;
import imd.ufrn.br.modelo.ContaCorrente;
import imd.ufrn.br.modelo.Pessoa;
import imd.ufrn.br.modelo.SeguroVida;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas;

    public PessoaDAO() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void listaPessoas() {
        for (Pessoa p : pessoas){
            ContaCorrente cc = p.getConta();
            SeguroVida seguro = p.getSeguro();
            System.out.println("************************************************************************");
            System.out.println("Nome...: " + p.getNome() + " Salario: " + p.getSalario());
            System.out.println("Agencia: " + cc.getAgencia() + " Conta: " + cc.getNumero() + " Saldo: " + cc.getSaldo());
            System.out.println("Seguro.: " + seguro.getNumero() + " Benceficario: " + seguro.getBeneficiado());
            System.out.println("Valor Seguro: "+ seguro.getValor());
        }
        System.out.println("************************************************************************");
    }

    public void CalcularTributosPessoas(){
        for (Pessoa p : pessoas){
            ContaCorrente cc = p.getConta();
            SeguroVida seguro = p.getSeguro();
            double totalTributos = GeradorImpostoRenda.calculaValorTotalTributo(p);

            System.out.println("************************************************************************");
            System.out.println("Nome...: " + p.getNome() + " IRPF: " + totalTributos);
        }
        System.out.println("************************************************************************");
    }

    public void imprimeImpostoTotal() {
        double totalImpostos = 0;

        Pessoa pessoaMaiorSeguro = new Pessoa();
        double maiorSeguro = 0;

        Pessoa pessoaMaiorImposto = new Pessoa();
        double maiorImposto = 0;

        for (Pessoa p : pessoas){
            ContaCorrente cc = p.getConta();
            SeguroVida seguro = p.getSeguro();
            double impostoPessoa = GeradorImpostoRenda.calculaValorTotalTributo(p);

            totalImpostos += impostoPessoa;

            if ( impostoPessoa > maiorImposto ) {
                pessoaMaiorImposto = p;
                maiorImposto = impostoPessoa;
            }

        }

        for (Pessoa p : pessoas){
            double seguroValorPessoa = p.getSeguro().getValor();

            if ( seguroValorPessoa > maiorSeguro ) {
                pessoaMaiorSeguro = p;
                maiorSeguro = seguroValorPessoa;
            }

        }


        System.out.println("************************************************************************");
        System.out.println("Total de impostos recolhidos: " + totalImpostos);
        System.out.println("Pessoa com maior IRPF a pagar: " + pessoaMaiorImposto.getNome());
        System.out.println("Valor: " + pessoaMaiorImposto.getNome());
        System.out.println("Maior beneficiado(a): " + pessoaMaiorSeguro.getNome());
        System.out.println("Valor beneficiado: " + pessoaMaiorImposto.getSeguro().getValor());
        System.out.println("************************************************************************");
    }
}
