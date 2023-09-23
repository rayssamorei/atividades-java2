package exercicios;
import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, media;

    System.out.print("Informe a primeira nota: ");
    nota1 = entrada.nextDouble();
    System.out.print("Informe a segunda nota: ");
    nota2 = entrada.nextDouble();
    
    media = (nota1 + nota2)/2;

    System.out.println("A média aritmética é: "+media);

    if((media >= 0) && (media < 3)){
        System.out.println("Você foi reprovado.");
    } else if((media >= 3) && (media < 7)){
        System.out.println("Você tem que fazer o exame.");
    } else if ((media >= 7) && (media <= 10)){
        System.out.println("Você foi aprovado!");
    } else {
        System.out.println("Média inválida.");
    }

    entrada.close();
    }
}
