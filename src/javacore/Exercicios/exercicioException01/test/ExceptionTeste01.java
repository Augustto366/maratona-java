package javacore.Exercicios.exercicioException01.test;

import javacore.Exercicios.exercicioException01.dominio.Celular;
import javacore.Exercicios.exercicioException01.dominio.Livro;
import javacore.Exercicios.exercicioException01.dominio.Produto;
import javacore.Exercicios.exercicioException01.exception.ClasseInvalidaException;
import javacore.Exercicios.exercicioException01.servico.CalcularImposto;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        Produto produto1 = new Celular("iPhone", 16000, "Apple");
        Produto livro = new Livro("1984", 23.40);
            CalcularImposto.xParcelas = 8;
            CalcularImposto.CalcularImposto(livro);
            CalcularImposto.parcelas(produto1);
    }
}
