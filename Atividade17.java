package exercicios;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = entrada.nextInt();

        if (senhaDigitada == 4531) {
            System.out.println("Acesso permitido. Bem-vindo!");
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }
        entrada.close();
    }
}
