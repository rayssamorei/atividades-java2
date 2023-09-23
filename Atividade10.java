package exercicios;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custo, dist, impos, price;

        System.out.println("Informe o custo de fábrica: ");
        custo = entrada.nextDouble();

        if (custo < 12.000){
            dist = 0.05;
            impos = 0.00;
        } else if ((custo >= 12.000) && (custo <= 25.000)){
            dist = 0.1;
            impos = 0.15;
        } else {
            dist = 0.15;
            impos = 0.2;
        }

        price = custo + (custo * dist) + (custo * impos);

        System.out.println(price);
        entrada.close();
    }
    
}