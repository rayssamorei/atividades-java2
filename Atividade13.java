package exercicios;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double price, newPrice;

        System.out.print("Preço do produto: R$ ");
        price = entrada.nextDouble();

        if (price <= 50) {
            newPrice = price + (price * 0.05);
        } else if (price <= 100) {
            newPrice = price + (price * 0.1);
        } else {
            newPrice = price + (price * 0.15);
        }

        System.out.println("Novo preço com aumento é de: " + "R$ " +  newPrice);
        
        System.out.print("A classificação desse preço é: ");

        if (newPrice <= 80) {
            System.out.print("Barato");
        } else if (newPrice <= 120) {
            System.out.print("Normal");
        } else if (newPrice <= 200) {
            System.out.print("Caro");
        } else {
            System.out.print("Muito caro");
        }
        
        entrada.close();
    }
}
