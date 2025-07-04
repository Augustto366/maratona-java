package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args) {
      /*  double salario = 6000;
        String mensagemDoar = "Eu vou doar 500tao pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar; // Operador ternário
        System.out.println(resultado); */

        // Exercício proposto
        double salary = 100000;
        double annualSalary = salary * 12;

        if (annualSalary > 0 && annualSalary <= 34712) {
            annualSalary *= 0.097;
        } else if (annualSalary > 34712 && annualSalary <= 68507) {
            annualSalary *= 0.3735;
        } else {
            annualSalary *= 0.4950;
        }
        System.out.println("You need pay: " + annualSalary);
    }
}
