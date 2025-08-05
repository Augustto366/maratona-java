package javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Augusto";
        String nome2 = "Augusto";
        String nomei = nome.concat(" da Silva");

        if (nomei == nome2) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
