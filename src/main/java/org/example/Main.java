public class Main {
    public static void main(String[] args) {
        // 1. Declara o valor em Reais e a cotação do Dólar
        double valorReais = 250.00;
        double cotacaoDolar = 5.15;

        // 2. Calcula a conversão de Reais para Dólares
        double valorDolares = valorReais / cotacaoDolar;

        // 3. Exibe os resultados no console
        System.out.println("Valor em Reais: R$ " + valorReais);
        System.out.println("Cotação do Dólar: R$ " + cotacaoDolar);
        System.out.printf("Valor convertido: US$ %.2f\n", valorDolares);
    }
            }