package exercicios;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioAtual, aumento, novoSalario;

        System.out.print("Salário atual: R$ ");
        salarioAtual = entrada.nextDouble();

        if (salarioAtual <= 300) {
            aumento = salarioAtual * 0.5;
        } else if ((salarioAtual > 300) && (salarioAtual<= 500)) {
            aumento = salarioAtual * 0.4;
        } else if ((salarioAtual > 500) && (salarioAtual <= 700)) {
            aumento = salarioAtual * 0.3;
        } else if ((salarioAtual > 700) && (salarioAtual <= 800)) {
            aumento = salarioAtual * 0.2;
        } else if ((salarioAtual > 800) && (salarioAtual <= 1.000)) {
            aumento = salarioAtual * 0.1;
        } else {
            aumento = salarioAtual * 0.05;
        }

        novoSalario = salarioAtual + aumento;

        System.out.println("Novo salário: R$ " + novoSalario);

        entrada.close();
    }
}
