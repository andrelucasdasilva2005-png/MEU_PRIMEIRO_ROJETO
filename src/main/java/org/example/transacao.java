package org.example;

public class transacao {
    public static void main(String[] args) {

        // Inicializa o contador
        int contador = 1;

        // Repete enquanto o contador for menor ou igual a 10
        while (contador <= 10) {

            // Exibe a mensagem para o participante
            System.out.println("Participante " + contador + " registrado!");

            // Incrementa o contador
            contador++;
        }

        // Finaliza o programa
        System.out.println("Todos os 10 participantes foram registrados.");
    }
}