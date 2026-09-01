public class Main {
    public static void main(String[] args) {
        // 1. Declara a distância percorrida (em km) e o combustível gasto (em litros)
        double distanciaKm = 350.0;
        double litrosGastos = 28.5;

        // 2. Calcula o consumo médio (km por litro)
        double consumoMedio = distanciaKm / litrosGastos;

        // 3. Exibe os resultados no console
        System.out.println("Distância percorrida: " + distanciaKm + " km");
        System.out.println("Total de combustível gasto: " + litrosGastos + " litros");
        System.out.printf("Consumo médio: %.2f km/l\n", consumoMedio);
    }
            }