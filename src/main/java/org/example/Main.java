public class Main {
    public static void main(String[] args) {
        // 1. Declaração do peso (kg) e da altura (m)
        double peso = 70.5;
        double altura = 1.75;

        // 2. Cálculo do IMC: peso / altura²
        double imc = peso / Math.pow(altura, 2);

        // 3. Exibição dos resultados no console
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("-------------------------");
        System.out.printf("Seu IMC é: %.2f\n", imc);
    }
            }