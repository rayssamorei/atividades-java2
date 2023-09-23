package exercicios;
import java.util.Scanner;

public class Atividade01{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, notaFinal;

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Informe a terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.print("Informe a quarta nota: ");
        nota4 = entrada.nextDouble();

        notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
    
        System.out.println("A sua média aritmética é: " + notaFinal);

        if (notaFinal >= 7){
            System.out.println("Você foi aprovado!");
        } else if (notaFinal < 7){
            System.out.println("Você foi reprovado!");
        }

        entrada.close();
    }
}