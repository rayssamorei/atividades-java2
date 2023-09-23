package exercicios;

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasExtras, horasFaltadas;
        double premio;

        System.out.print("Informe o número de horas extras: ");
        horasExtras = entrada.nextInt();
        System.out.print("Informe o número de horas faltadas: ");
        horasFaltadas = entrada.nextInt();

        if (horasExtras >= 2400) {
            premio = 500.00;
        } else if (horasExtras >= 1800 && horasExtras < 2400) {
            premio = 400.00;
        } else if (horasExtras >= 1200 && horasExtras < 1800) {
            premio = 300.00;
        } else if (horasExtras >= 600 && horasExtras < 1200) {
            premio = 200.00;
        } else {
            premio = 100.00;
        }

        premio -= (2.0 / 3.0) * horasFaltadas;

        if (premio < 100.00) {
            premio = 100.00;
        }

        System.out.println("O prêmio de Natal é de R$" + premio);

        entrada.close();
    }
}
