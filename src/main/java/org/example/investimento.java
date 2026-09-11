package org.example;

import java.util.Scanner;

public class investimento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorInvestido;

        System.out.print("Digite o valor investido: ");
        valorInvestido = entrada.nextDouble();

        if (valorInvestido <= 10000) {
            System.out.println("Categoria: Bronze");
        } else if (valorInvestido <= 50000) {
            System.out.println("Categoria: Prata");
        } else if (valorInvestido <= 100000) {
            System.out.println("Categoria: Ouro");
        } else {
            System.out.println("Categoria: Platinum");
        }

        entrada.close();
    }
}
