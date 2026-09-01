public class Main {
    public static void main(String[] args) {
        // 1. Declaração do capital inicial, taxa de juros mensal e tempo em meses
        double capital = 1000.00; // Capital inicial (C)
        double taxaPercentual = 2.5; // Taxa de juros mensal em % (ex: 2.5%)
        int tempoMeses = 12; // Tempo em meses (t)

        // 2. Converte a taxa percentual para taxa decimal (i)
        double taxaDecimal = taxaPercentual / 100;

        // 3. Calcula os juros simples: J = C * i * t
        double juros = capital * taxaDecimal * tempoMeses;

        // 4. Calcula o montante final: M = C + J
        double montanteFinal = capital + juros;

        // 5. Exibe os resultados no console
        System.out.println("Capital Inicial: R$ " + capital);
        System.out.println("Taxa de Juros: " + taxaPercentual + "% ao mês");
        System.out.println("Tempo: " + tempoMeses + " meses");
        System.out.println("-----------------------------------");
        System.out.printf("Total de Juros: R$ %.2f\n", juros);
        System.out.printf("Montante Final: R$ %.2f\n", montanteFinal);
    }
            }