public class Main {
    public static void main(String[] args) {
        // 1. Declara dois números inteiros
        int dividendo = 17;
        int divisor = 5;

        // 2. Calcula o quociente (divisão inteira) e o resto (%)
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        // 3. Exibe os resultados no console
        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("-------------------------");
        System.out.println("Quociente (divisão inteira): " + quociente);
        System.out.println("Resto da divisão (%): " + resto);
    }
            }