public class Main {
    public static void main(String[] args) {
        // 1. Declara a medida do raio do círculo
        double raio = 5.0;

        // 2. Calcule a área usando a fórmula: A = π * r²
        double area = Math.PI * Math.pow(raio, 2);

        // 3. Exibe o resultado no console
        System.out.println("Raio do círculo: " + raio);
        System.out.printf("Área do círculo: %.2f\n", area);
    }
            }