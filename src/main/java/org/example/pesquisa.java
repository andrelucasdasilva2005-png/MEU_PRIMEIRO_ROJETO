package org.example;

import java.util.Scanner;

public class pesquisa {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            // Inicia o contador de clientes
            int cliente = 1;

            // Inicia a quantidade de avaliações
            int quantidade = 0;

            // Repete até registrar 10 clientes
            while (cliente <= 10) {

                // Solicita a nota de satisfação
                System.out.print("Digite a nota de satisfação do cliente " + cliente + ": ");
                double nota = entrada.nextDouble();

                // Conta a avaliação registrada
                quantidade++;

                // Passa para o próximo cliente
                cliente++;
            }

            // Exibe a quantidade de avaliações
            System.out.println("Quantidade de avaliações registradas: " + quantidade);

            entrada.close();
        }
}
