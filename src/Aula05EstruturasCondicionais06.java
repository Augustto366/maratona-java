public class Aula05EstruturasCondicionais06 {
    public static void main (String[] args) {
        int day = 7;

        switch (day) {
            case 1, 7:
                System.out.println("Final de semana.");
                break;
            case 2,3, 4, 5, 6:
                System.out.println("Dia útil.");
                break;
        }
    }
}
