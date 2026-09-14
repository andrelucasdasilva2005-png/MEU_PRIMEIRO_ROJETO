package org.example;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Inicia o contador de vendas
        int venda = 1;

        // Inicializa o total do faturamento
        double total = 0;

        // Repete enquanto não forem registradas 5 vendas
        while (venda <= 5) {

            // Solicita o valor da venda
            System.out.print("Digite o valor da venda " + venda + ": R$ ");
            double valor = entrada.nextDouble();

            // Soma o valor da venda ao total
            total = total + valor;

            // Passa para a próxima venda
            venda++;
        }

        // Exibe o faturamento total
        System.out.printf("Faturamento total do dia: R$ %.2f%n", total);

        entrada.close();
    }
}
