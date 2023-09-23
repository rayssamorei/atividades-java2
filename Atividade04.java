package exercicios;
import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.print("Informe o segundo número: ");
        n2 = entrada.nextDouble();
        System.out.print("Informe o terceiro número: ");
        n3 = entrada.nextDouble();

        if((n1 >= n2) && (n1 >= n3)){
            System.out.println(n1 + " é maior");
        }else if((n2 >= n1) && (n2 >= n3)){
            System.out.println(n1 + " é maior");
        }else if((n3 >= n2) && (n3 >= n1)){
            System.out.println(n1 + " é maior");
        }

        entrada.close();
    }
}
