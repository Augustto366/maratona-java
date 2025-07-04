package introducao;

public class Aula07Arrays03 {
    public static void main (String[] args) {
        int [] age = new int[5];
        int[] ages2 = {1, 2, 3, 4, 5, 6};
        /*for (int i = 0; i < ages2.length; i++) {
            System.out.println(ages2[i]);
        }*/

        // foreach
        for(int num: ages2) {
            System.out.println(num);
        }
    }
}
