package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Darwin";
        String nome2 = "      Charles    ";

        System.out.println(nome.charAt(2));
        System.out.println(nome.replace("D", "T"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(1, 5));
        System.out.println(nome.substring(2, nome.length()));
        System.out.println(nome2);
        System.out.println(nome2.trim());
    }
}
