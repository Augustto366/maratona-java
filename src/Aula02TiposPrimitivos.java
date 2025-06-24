public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int casting = (int) 10000000000L; // Casting força a variável "aceitar" o valor.


        int idade = 10;
        long numeroGrande = 1000000; // 8 bytes
        double salarioDouble = 2000; // 8 bytes
        double testDouble = 2000.0D;
        float salarioFloat = 2500; // 4 bytes
        float testSalario = 2500.0F;
        byte idadeByte = -128; // 1 byte
        short idadeSHort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false;
        char caracter = 'M'; // 2 bytes

        String nome = "Marcelo"; // String é uma classe, não um tipo primitivo.
        System.out.println(nome);
        System.out.println("A idade é: " + casting + " anos. :)");
    }
}
