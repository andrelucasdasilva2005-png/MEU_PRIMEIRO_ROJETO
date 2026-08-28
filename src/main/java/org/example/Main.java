public class Main {
    public static void main(String[] args) {
        // 1. Variável float com valor fracionado (o 'f' no final indica que é um float)
        float valorFloat = 123.75f;

        // 2. Casting Explícito: float -> long (ocorre truncagem, perde a parte decimal)
        long valorLong = (long) valorFloat;

        // 3. Casting Implícito: long -> double (promovido automaticamente para decimal)
        double valorDouble = valorLong;

        // Exibe todos os valores no console
        System.out.println("Valor Float: " + valorFloat);
        System.out.println("Valor Long (Casting Explícito): " + valorLong);
        System.out.println("Valor Double (Casting Implícito): " + valorDouble);
    }
}