package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.TV;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestCalculo2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel 8086", 20000);
        Produto produto2 = new Tomate("Paulista", 20, "11/02/2028");
        Produto produto3 = new TV("Philco", 1530);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto3);
    }
}
