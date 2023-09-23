package exercicios;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String procedencia;
        int codigoOrigem;

        System.out.print("Informe o preço do produto: ");
        double price = entrada.nextDouble();

        System.out.print("Escolha um codigo de origem (De 1 a 30): ");
        codigoOrigem = entrada.nextInt();

        if ((codigoOrigem >= 1) && (codigoOrigem <= 30)) {
            switch (codigoOrigem) {
                case 1:
                    procedencia = "Sul";
                    break;
                case 2:
                    procedencia = "Norte";
                    break;
                case 3:
                    procedencia = "Leste";
                    break;
                case 4:
                    procedencia = "Oeste";
                    break;
                case 5:
                case 6:
                    procedencia = "Nordeste";
                    break;
                case 7:
                case 8:
                case 9:
                    procedencia = "Sudeste";
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    procedencia = "Centro-oeste";
                    break;
                default:
                    procedencia = "Norte";
                    break;
            }
            System.out.println("A procedência do produto de acordo com seu código de origem e preço " + price + " é do " + procedencia + ".");
        } else {
            System.out.println("Código de origem inválido! Deve estar entre 1 e 30.");
        }

        entrada.close();
    }
}
