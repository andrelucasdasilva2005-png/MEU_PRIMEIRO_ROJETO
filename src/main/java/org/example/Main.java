public class Main {
    public static void main(String[] args) {
        // 1. Declaração e atribuição das três notas
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.2;

        // 2. Cálculo da média aritmética simples
        double media = (nota1 + nota2 + nota3) / 3.0;

        // 3. Exibição das notas e do resultado no console
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("-------------------------");
        System.out.printf("Média Final: %.2f\n", media);
    }
            }