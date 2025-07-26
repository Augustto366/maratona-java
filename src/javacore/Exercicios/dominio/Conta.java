package javacore.Exercicios.dominio;

public abstract class Conta {
    protected double saldo;

    public double obterSaldo() {
        return this.saldo;
    }

    public void depositar(double saldo) {
        this.saldo = saldo;
    }

    public void sacar (double sacar) {
        saldo = saldo - sacar;
        System.out.println("Você sacou: " + sacar +". Novo saldo: " + saldo);
    }
}
