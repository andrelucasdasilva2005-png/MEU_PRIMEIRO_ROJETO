package org.example;

import java.util.Scanner;

public class transacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorTransacao;

        System.out.print("Digite o valor da transação: ");
        valorTransacao = entrada.nextDouble();

        if (valorTransacao > 10000) {
            System.out.println("Transação suspeita! Deve ser sinalizada para análise.");
        } else {
            System.out.println("Transação normal. Não precisa ser sinalizada.");
        }

        entrada.close();
    }
}
