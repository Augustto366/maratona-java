package javacore.Exercicios.dominio;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calcTributos() {
        return saldo = saldo - (saldo * 0.01);
    }
}
