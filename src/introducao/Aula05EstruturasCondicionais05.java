package introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main (String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("QUarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
