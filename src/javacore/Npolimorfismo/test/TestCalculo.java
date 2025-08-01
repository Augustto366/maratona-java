package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestCalculo {
    public static void main(String[] args) {
        Computador computador = new Computador("IBM", 28000);
        Tomate tomate = new Tomate("Tomate Paulista", 18, "09/10/2025");
    }
}
