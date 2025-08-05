package javacore.Qstring.test;

public class StringPerformaceTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de: " + (fim - inicio) + "ms");

        System.out.println("-------");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de: " + (fim - inicio) + "ms");

        System.out.println("-------");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de: " + (fim - inicio) + "ms");
    }


    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
