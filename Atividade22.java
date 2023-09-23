package exercicios;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, idade, grupoDeRisco;

        System.out.print("Informe sua idade: ");
        idade = entrada.nextDouble();
        System.out.print("Informe seu peso: ");
        peso = entrada.nextDouble();

        grupoDeRisco = (idade < 20)
                ? (peso <= 60) ? 9 : (peso <= 90) ? 8 : 7
                : (idade <= 50)
                ? (peso <= 60) ? 6 : (peso <= 90) ? 5 : 4
                : (peso <= 60) ? 3 : (peso <= 90) ? 2 : 1;

        System.out.println("O grupo de risco da pessoa é: " + grupoDeRisco);

        entrada.close();
    }
}
