package javacore.Oexception.exception.test;

import java.io.File;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo/teste2.txt");
        try {
            boolean IsCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + IsCriado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
