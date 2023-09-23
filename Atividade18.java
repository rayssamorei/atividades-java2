package exercicios;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double idade;
        System.out.print("Insira sua idade: ");
        idade = entrada.nextDouble();

        if (idade < 18){
            System.out.println("Você é menor de idade.");
        }
        else{
            System.out.println("Você é maior de idade.");
        }

        entrada.close();
    }
}
