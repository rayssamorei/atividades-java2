package exercicios;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        System.out.print("Digite a idade do nadador: ");
        idade = input.nextInt();

        if (idade < 5) {
            System.out.println("Idade inferior a 5 anos. Não há categoria.");
        } else if ((idade >= 5) && (idade <= 7)) {
            System.out.println("Categoria: Infantil");
        } else if ((idade >= 8) && (idade <= 10)) {
            System.out.println("Categoria: Juvenil");
        } else if ((idade >= 11) && (idade <= 15)) {
            System.out.println("Categoria: Adolescente");
        } else if ((idade >= 16) && (idade <= 30)) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Sênior");
        }

        input.close();
    }
}
