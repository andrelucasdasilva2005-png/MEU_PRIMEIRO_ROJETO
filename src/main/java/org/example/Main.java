package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Declara uma variável do tipo int e atribui um valor
        int NumeroInt = 42;

// Ocorre o casting implícito (promoção automática de int para double)
        double NumeroDouble = NumeroInt;

// Exibe o valor da variável double no console
        System.out.println("Valor em double: " + NumeroDouble);
    }
}
