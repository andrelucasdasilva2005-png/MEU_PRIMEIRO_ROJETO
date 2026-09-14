package org.example;
public class programa {
    public static void main(String[] args) {

        // Inicia o contador de itens
        int item = 1;

        // Verifica se o item é menor ou igual a 15
        while (item <= 15) {

            // Exibe a mensagem do produto conferido
            System.out.println("Produto " + item + " Conferido");

            // Passa para o próximo item
            item++;
        }
    }
}
