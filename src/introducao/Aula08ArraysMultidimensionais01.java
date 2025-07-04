package introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main (String[] args) {
        int [][] array = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }*/

        for (int [] arrBase: array) {
            for (int elements: arrBase) {
                System.out.println(elements);
            }
        }


    }
}
