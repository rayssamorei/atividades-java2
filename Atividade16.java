package exercicios;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double produto, desconto, newPrice;

        System.out.print("Produto:R$ ");
        produto = entrada.nextDouble();

        if (produto <= 30) {
            desconto = 0;
        } else if ((produto > 30) && (produto <=100)) {
            desconto = produto - (produto * 0.10);
        } else {
            desconto = produto - (produto * 0.15);
        }

        newPrice = produto + desconto;

        System.out.println("Aumento: R$"+ desconto);
        System.out.println("Novo salário: R$"+ newPrice);

        entrada.close();
    }
}
