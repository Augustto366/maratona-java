package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main (String[] args) {
        Gerente gerente = new Gerente("Sub-Zero", 3500);
        Desenvolvedor dev = new Desenvolvedor("Akita", 18000);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
