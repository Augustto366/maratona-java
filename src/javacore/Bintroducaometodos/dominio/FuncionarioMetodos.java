package javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class FuncionarioMetodos {

    public double mediaSalario (double[] salario) {
        double sum = 0;
        double result = 0;
        if (salario != null) {
            for (double num: salario) {
                sum += num;
                result = sum / salario.length;
            }
            System.out.printf("Média salarial: " + "%, .2f", result);
        } else {
            System.out.println("Sem salário registrado.");
        }
        return result;
    }
}
