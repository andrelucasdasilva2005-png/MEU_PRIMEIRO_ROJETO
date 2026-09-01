public class Main {
    public static void main(String[] args) {
        // 1. Declaração do capital inicial, taxa de juros e tempo
        double capital = 1500.00;      // Capital inicial (C)
        double taxaMensal = 2.0;       // Taxa de juros ao mês em porcentagem (%)
        int tempoMeses = 6;            // Período em meses (t)

        // 2. Converte a taxa de porcentagem para valor decimal (i)
        double i = taxaMensal / 100.0;

        // 3. Cálculo dos juros simples: J = C * i * t
        double juros = capital * i * tempoMeses;

        // 4. Cálculo do montante final: M = C + J
        double montante = capital + juros;

        // 5. Exibição dos resultados
        System.out.println("Capital Inicial: R$ " + capital);
        System.out.println("Taxa Mensal: " + taxaMensal + "%");
        System.out.println("Tempo: " + tempoMeses + " meses");
        System.out.println("-----------------------------------");
        System.out.printf("Juros Acumulados: R$ %.2f\n", juros);
        System.out.printf("Montante Final: R$ %.2f\n", montante);
    }
            }