package org.example;

import java.util.Scanner;

public class tarifas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldoMedio;

        System.out.print("Digite o saldo médio mensal: ");
        saldoMedio = entrada.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Tarifa bancária isenta!");
        } else {
            System.out.println("Tarifa bancária mantida.");
        }

        entrada.close();
    }
}