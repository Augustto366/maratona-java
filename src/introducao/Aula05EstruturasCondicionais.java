package introducao;

public class Aula05EstruturasCondicionais {
    public static void main (String[] args) {
        int idade = 17;
        boolean isAutorixadoComprarBebida = idade >= 18;
        if (isAutorixadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }
    }
}
