package exercicios;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o sexo (M para masculino e F para feminino): ");
        char sexo = entrada.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para um homem com " + altura + " metros de altura é " + pesoIdeal + " kg.");
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para uma mulher com " + altura + " metros de altura é " + pesoIdeal + " kg.");
        } else {
            System.out.println("Sexo inválido. Por favor, insira M ou F.");
        }

        entrada.close();
    }
}
