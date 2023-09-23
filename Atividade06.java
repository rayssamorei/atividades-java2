package exercicios;
import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0, res1 = 0;
        int op;

        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.print("Informe o segundo número: ");
        n2 = entrada.nextDouble();

        System.out.println(
            "1 - O primeiro número elevado ao segundo "+
            "\n2 - Raiz quadrada de cada um dos números"+
            "\n3 - Raiz cúbica de cada um dos números"+
            "\nEscolha uma das opções: "
        );
        op = entrada.nextInt();

        switch (op) {
            case 1:
                res = Math.pow(n1, n2);
                break;
            case 2:
                res = Math.sqrt(n1);
                res1 = Math.sqrt(n2);
                break;
            case 3:
                res = Math.cbrt(n1);
                res1 = Math.cbrt(n2);
                break;
            default:
                System.out.println("Erro!");
                break;
        }
        if (op == 1) {
            System.out.println("O resultado da operação é: " + res);
        } else if ((op == 2) || (op == 3)){
            System.out.println("O resultado da operação é: " + res);
            System.out.println("O resultado da operação é " + res1);
        }
        entrada.close();
    }
}
