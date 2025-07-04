package introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main (String[] args) {
        int [][] array = new int[3][];
        int[] array2 = {533};

        array[0] = new int[]{1, 2, 3, 4, 5};
        array[1] = new int[]{6, 7};
        array[2] = array2;

        for(int[] arrayBase: array) {
            System.out.println("\n-------");
            for (int elements: arrayBase) {
                System.out.println(elements);
            }
        }
    }
}
