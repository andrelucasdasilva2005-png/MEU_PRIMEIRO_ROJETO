public class Main {
    public static void main(String[] args) {
        // 1. Declara a medida em metros
        double metros = 2.5;

        // 2. Realiza as conversões
        // 1 metro = 100 centímetros
        double centimetros = metros * 100;

        // 1 metro = 1000 milímetros
        double milimetros = metros * 1000;

        // 3. Exibe os resultados no console
        System.out.println("Medida em metros: " + metros + " m");
        System.out.println("-----------------------------------");
        System.out.printf("Em centímetros: %.2f cm\n", centimetros);
        System.out.printf("Em milímetros: %.2f mm\n", milimetros);
    }
            }