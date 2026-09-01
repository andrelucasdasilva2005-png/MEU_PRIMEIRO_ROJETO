public class Main {
    public static void main(String[] args) {
        // 1. Declaração das variáveis A e B com valores iniciais
        int a = 10;
        int b = 25;

        // Exibe os valores ANTES da troca
        System.out.println("--- ANTES DA TROCA ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // 2. Lógica de troca usando uma variável auxiliar (temp)
        int temp = a; // Salva o valor de A na variável temporária
        a = b;        // A recebe o valor de B
        b = temp;     // B recebe o valor original de A que estava salvo em temp

        // Exibe os valores DEPOIS da troca
        System.out.println("\n--- DEPOIS DA TROCA ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
            }