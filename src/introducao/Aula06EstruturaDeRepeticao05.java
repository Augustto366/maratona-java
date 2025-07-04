package introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main (String[] args) {
        double valueTotal = 30000;
        for (int i = (int) valueTotal; i >= 1; i--) {
            double v = valueTotal/i;
            if (v < 1000) {
                continue;
            }
            System.out.println("Parcela " + i + " R$" + v);

        }
    }
}
