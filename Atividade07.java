package exercicios;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioFinal;

        System.out.println("Informe sua quantia de salário: ");
        salario = entrada.nextDouble();
        
        if (salario < 500) {
            salarioFinal = salario * 1.3;
            System.out.println("Seu novo salário é: " + salarioFinal);
        } else {
            System.out.println("Você não irá receber o reajuste.");
        }
        entrada.close();
    }
}
