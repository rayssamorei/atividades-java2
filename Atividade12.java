package exercicios;
import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioB, salarioFinal, grat;

        System.out.println("Informe o salário bruto: ");
        salarioB = entrada.nextDouble();

        if (salarioB < 300) {
            grat = 100;
        } else if ((salarioB > 350) && (salarioB < 600)){
            grat = 75;
        } else if ((salarioB >= 600) && (salarioB <= 900)){
            grat = 50;
        } else {
            grat = 35;
        }

        salarioFinal = salarioB + grat - (salarioB * 0.07);

        System.out.println("Seu salário bruto com a gratificação de " + grat + " ficou de R$" + salarioFinal);
        entrada.close();
    }
}
