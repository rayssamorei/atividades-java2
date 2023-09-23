package exercicios;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco, aumento, imposto, novoPreco;
        int categoria;
        char situacao;

        System.out.print("Informe o preço do produto: R$");
        preco = entrada.nextDouble();
        System.out.print("Informe a categoria (1 - limpeza, 2 - alimentação, 3 - vestuário): ");
        categoria = entrada.nextInt();
        System.out.print("Informe a situação (R - produtos que necessitam de refrigeração, N - produtos que não necessitam de refrigeração): ");
        situacao = entrada.next().charAt(0);
        
        if ((situacao == 'R') && (situacao == 'r')){
            situacao = 'R';
        } else if ((situacao == 'N') && (situacao == 'n')){
            situacao = 'N';
        } else {
            System.out.println("Situação inválida. Tente novamente.");
        }

        if (preco <= 25) {
            switch (categoria) {
                case 1:
                    aumento = preco * 0.05;
                    break;
                case 2:
                    aumento = preco * 0.08;
                    break;
                case 3:
                    aumento = preco * 0.10;
                    break;
                default:
                    aumento = 0;
                    System.out.println("Resultado inválido");
                    break;
            }
        } else {
            switch (categoria) {
                case 1:
                    aumento = preco * 0.12;
                    break;
                case 2:
                    aumento = preco * 0.15;
                    break;
                case 3:
                    aumento = preco * 0.18;
                    break;
                default:
                    aumento = 0;
                    System.out.println("Resultado Inválido");
                    break;
            }
        }

        if (categoria == 2 && situacao == 'R') {
            imposto = preco * 0.05;
        } else {
            imposto = preco * 0.08;
        }

        novoPreco = (preco + aumento) - imposto;

        String classificacao;
        if (novoPreco <= 50.00) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.00) {
            classificacao = "Normal";
        } else {
            classificacao = "Caro";
        }

        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Valor do imposto: R$" + imposto);
        System.out.println("Novo preço: R$" + novoPreco);
        System.out.println("Classificação: " + classificacao);

        entrada.close();
    }
}
