package exercicios;
import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo, credito, credFinal;

        System.out.print("Informe o valor do seu saldo médio: ");
        saldo = entrada.nextDouble();
        
        if (saldo > 400){
            credito = 0.3;
        } else if ((saldo <= 400) && (saldo > 300)){
            credito = 0.25;
        } else if ((saldo <= 300) && (saldo > 200)){
            credito = 0.2;
        } else {
            credito = 0.1;
        }
        
        credFinal = saldo * credito;
        saldo = credFinal + saldo;
        
        System.out.println("O valor do crédito é: R$" + credFinal);
        System.out.println("O valor do Saldo Médio é: R$" + saldo );

        entrada.close();
    }
}
