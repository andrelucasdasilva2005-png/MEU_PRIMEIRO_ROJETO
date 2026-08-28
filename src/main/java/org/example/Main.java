public class Main {
    public static void main(String[] args) {
        // 1. Declara a variável short
        short valorShort = 100;

        // 2. Casting Implícito: short -> int (promovido automaticamente)
        int valorInt = valorShort;

        // 3. Casting Explícito: short -> byte (exige o uso de (byte))
        byte valorByte = (byte) valorShort;

        // Exibe todos os valores no console
        System.out.println("Valor em short: " + valorShort);
        System.out.println("Valor em int (Casting Implícito): " + valorInt);
        System.out.println("Valor em byte (Casting Explícito): " + valorByte);
    }
            }