package org.example;

import java.util.Scanner;

public class cartao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double renda;
        int score;

        System.out.print("Digite a renda mensal: ");
        renda = entrada.nextDouble();

        System.out.print("Digite o score de crédito: ");
        score = entrada.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado!");
        }

        entrada.close();
    }
}

