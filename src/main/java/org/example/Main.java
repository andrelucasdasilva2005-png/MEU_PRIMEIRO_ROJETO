package org.example;

public class Main {

    // Função que soma dois números inteiros
    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {

        // Chama a função e armazena o resultado
        int resultado = somar(10, 20);

        // Exibe o resultado na tela
        System.out.println("A soma é: " + resultado);
    }
}