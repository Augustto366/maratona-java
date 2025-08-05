package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Marcelo Augusto";
        nome.concat("da Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Augustinho");
        sb.append(" Carrara").append("Farreira");
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
    }
}
