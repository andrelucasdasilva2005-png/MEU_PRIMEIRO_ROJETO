package org.example;
import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Inicializa o total das vendas
        double total = 0;

        // Controla se o operador deseja continuar
        String continuar = "s";

        // Repete enquanto o operador desejar continuar
        while (continuar.equalsIgnoreCase("s")) {

            // Solicita o valor do produto
            System.out.print("Digite o valor do produto: R$ ");
            double valor = entrada.nextDouble();

            // Soma o valor ao total
            total = total + valor;

            // Pergunta se deseja continuar
            System.out.print("Deseja registrar outro produto? (s/n): ");
            continuar = entrada.next();
        }

        // Exibe o total das vendas
        System.out.printf("Total das vendas: R$ %.2f%n", total);

        entrada.close();
    }
}