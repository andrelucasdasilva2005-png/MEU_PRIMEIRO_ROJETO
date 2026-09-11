package org.example;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double parcela;

        System.out.print("Digite o salário: ");
        salario = entrada.nextDouble();

        System.out.print("Digite o valor da parcela: ");
        parcela = entrada.nextDouble();

        if (parcela <= salario * 0.30) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo recusado!");
        }

        entrada.close();
    }
}

