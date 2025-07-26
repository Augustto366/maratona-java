package javacore.Exercicios.test;

import javacore.Exercicios.dominio.ContaCorrente;
import javacore.Exercicios.dominio.ContaPoupanca;
import javacore.Exercicios.dominio.SeguroDeVida;

public class TestTributo {
    public static void main(String[] args) {
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        double v = seguroDeVida.calcTributos();

        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Conta Corrente");
        contaCorrente.depositar(1800);
        contaCorrente.calcTributos();
        double total = contaCorrente.calcTributos() - v;
        System.out.println("Saldo após descontos tributários e seguro de vida: " + total);
        contaCorrente.sacar(200);
        System.out.println("Conta Poupança");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1768);
        System.out.println("Saldo: " + contaPoupanca.obterSaldo());
        contaPoupanca.sacar(360);
        System.out.println("Seguro de Vida");



    }
}
