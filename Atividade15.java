package exercicios;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double taxaPoupanca = 0.03, taxaRendaFixa = 0.04, valorCorrigido = 0, valorInvestido = 0;
        String tipoDescricao = "";

        System.out.println("Olá investidor, digite o tipo de investimento que você deseja realizar em nosso banco.");
        System.out.println("Digite abaixo de acordo com as instruções: ");
        System.out.println("1 para Poupança e 2 para Fundos de renda fixa. ");
        int tipoInvestimento = entrada.nextInt();
        
        if ((tipoInvestimento == 1) || (tipoInvestimento == 2)){
            System.out.print("Digite o valor do investimento: ");
            valorInvestido = entrada.nextDouble();
        } else {
            tipoInvestimento = 0;
        }
        


        switch (tipoInvestimento) {
            case 1:
                valorCorrigido = valorInvestido + (valorInvestido * taxaPoupanca);
                tipoDescricao = "Poupança";
                break;
            case 2:
                valorCorrigido = valorInvestido + (valorInvestido * taxaRendaFixa);
                tipoDescricao = "Fundos de renda fixa";
                break;
            default:
                System.out.println("Tipo de investimento inválido. Por favor, tente novamente.");
                System.exit(0);
        }


        System.out.println("Após um mês de investimento em " + tipoDescricao + " você terá: R$" + valorCorrigido);

        entrada.close();
    }
}
