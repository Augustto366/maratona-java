package javacore.Exercicios.exercicioException01.exception;

public class ClasseInvalidaException extends Exception{
    public ClasseInvalidaException() {
        super("produto não é um tipo Celular.");
    }

    public ClasseInvalidaException(String message) {
        super(message);
    }
}
