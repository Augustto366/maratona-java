package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.TV;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestCalculo3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel 8086", 20000);
        Produto produto2 = new Tomate("Paulista", 20, "11/03/2026");
        CalculadoraImposto.calcularImposto(produto);

    }
}
