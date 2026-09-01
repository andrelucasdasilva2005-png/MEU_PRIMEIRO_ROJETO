public class Main {
    public static void main(String[] args) {
        // 1. Declara a quantidade total de segundos
        int totalSegundos = 7385;

        // 2. Calcula as horas, minutos e segundos restantes
        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;

        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;

        // 3. Exibe o resultado formatado no console
        System.out.println("Total de segundos inseridos: " + totalSegundos);
        System.out.println("-----------------------------------");
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
            }