package introducao;

public class Aula07Arrays02 {
    public static void main (String[] args) {
        String[] names =  new String[3];
        names[0] = "Marcelo";
        names[1] = "Pitágoras";
        names[2] = "Newton";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
