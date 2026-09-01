public class Main {
    public static void main(String[] args) {
        // 1. Declara o valor original do produto
        double valorOriginal = 100.0;

        // 2. Define o percentual de desconto (15%)
        double percentualDesconto = 15.0;

        // 3. Calcula o valor do desconto e o valor final com desconto
        double valorDesconto = valorOriginal * (percentualDesconto / 100.0);
        double valorFinal = valorOriginal - valorDesconto;

        // 4. Exibe os resultados no console
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Valor do desconto (15%): R$ " + valorDesconto);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
    }
            }