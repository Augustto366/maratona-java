import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do carro?");
        double carPrice = scanner.nextDouble();


        // Enquanto o contador "i" for menor que o valor do carro, "i" recebe mais um
        for (int i = 1; i <= carPrice; i++) {
        // Valor do preço do carro divido pelo número que está o "i"
            double v = carPrice/i;
        // Enquanto o "v" estiver com o valor maior que 1000, continue imprimindo
            if (v >= 1000) {
                if (i > 3) {
                    double acr = v + v * 0.02;
                    v = acr;
                }
                System.out.println("Parcelar em " + i + " de " + v);
            } else {
        // Quando o valor de "v" for menor que 1000, encerre
                break;
            }
        }
    }
}
