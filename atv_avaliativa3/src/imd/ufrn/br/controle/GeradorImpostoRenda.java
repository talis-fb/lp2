package imd.ufrn.br.controle;

import imd.ufrn.br.modelo.ContaCorrente;
import imd.ufrn.br.modelo.Pessoa;
import imd.ufrn.br.modelo.SeguroVida;

public class GeradorImpostoRenda {
    public static double calculaValorTotalTributo(Pessoa pessoa) {
        ContaCorrente cc = pessoa.getConta();
        SeguroVida seguro = pessoa.getSeguro();
        /*
        System.out.println("AQUI FOI COM "+ pessoa.getNome());
        System.out.println(seguro.getValor());
        System.out.println(seguro.calcularTributos());
        System.out.println(cc.getSaldo());
        System.out.println(cc.calcularTributos());
        */

        double totalTributo = cc.calcularTributos() + seguro.calcularTributos();
        return totalTributo;
    }
}
