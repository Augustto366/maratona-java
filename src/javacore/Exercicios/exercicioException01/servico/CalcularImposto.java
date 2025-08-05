package javacore.Exercicios.exercicioException01.servico;

import javacore.Exercicios.exercicioException01.dominio.Celular;
import javacore.Exercicios.exercicioException01.dominio.Produto;
import javacore.Exercicios.exercicioException01.exception.ClasseInvalidaException;

public class CalcularImposto {
    public static int xParcelas;


    public static void CalcularImposto(Produto produto)  {
        double imposto = produto.getPreco() * 0.66;
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Imposto pago: " + imposto);

            if (produto instanceof Celular) {
                    Celular celular = (Celular) produto;
                    System.out.println("Marca: " + celular.getMarca());
            }
    }

    public static void parcelas (Produto produto) {
        try {
            if (xParcelas != 0) {
                double numeroParcelas = produto.getPreco() / xParcelas;
                System.out.println("Parcelado em " + xParcelas + "x de " + numeroParcelas);
            } else  {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
