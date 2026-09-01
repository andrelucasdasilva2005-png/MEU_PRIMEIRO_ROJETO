public class Main {
    public static void main(String[] args) {
        // 1. Declara o valor por hora e o total de horas trabalhadas no mês
        double valorHora = 35.50;
        double horasTrabalhadas = 160.0;

        // 2. Calcula o salário bruto (Valor por Hora * Horas Trabalhadas)
        double salarioBruto = valorHora * horasTrabalhadas;

        // 3. Exibe os resultados no console
        System.out.println("Valor por hora: R$ " + valorHora);
        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas + "h");
        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
    }
            }