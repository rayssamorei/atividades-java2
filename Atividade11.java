package exercicios;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento, salarioNovo;

        System.out.println("Informe seu salário atual: ");
        salario = entrada.nextDouble();

        if (salario < 300) {
            aumento = 0.15;
        }else if ((salario > 300) && (salario < 600 )){
            aumento = 0.1;
        }else if ((salario >= 600) && (salario <= 900)){
            aumento = 0.05;
        } else {
            aumento = 0.0;
        }

        salarioNovo = (salario * aumento) + salario;

        System.out.println("Seu novo salário é: R$" + salarioNovo);
        System.out.println("E seu aumento foi de: " + aumento);

        entrada.close();
    }
}
