package exercicios;
import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento35, aumento15;

        System.out.print("Informe a quantia do seu salário: R$ ");
        salario = entrada.nextDouble();

        aumento35 = (salario * 0.35) + salario;
        aumento15 = (salario * 0.15) + salario;

        if(salario <= 300){
            System.out.println("Seu aumento será de 35%. Seu salário reajustado é: R$" + aumento35);
        } else {
            System.out.println("Seu aumento será de 15%. Seu salário reajustado é de: R$"+aumento15);
        }
        entrada.close();
    }
}
