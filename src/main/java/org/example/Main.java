public class Main {
    public static void main(String[] args) {
        // 1. Declaração das três variáveis booleanas
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("cond1: " + cond1);
        System.out.println("cond2: " + cond2);
        System.out.println("cond3: " + cond3);
        System.out.println("-----------------------------------");

        // 2. Operador E (AND) -> && (Verdadeiro se TODAS forem verdadeiras)
        boolean resultadoAnd = cond1 && cond3;
        System.out.println("cond1 E cond3 (cond1 && cond3): " + resultadoAnd);

        // 3. Operador OU (OR) -> || (Verdadeiro se PELO MENOS UMA for verdadeira)
        boolean resultadoOr = cond1 || cond2;
        System.out.println("cond1 OU cond2 (cond1 || cond2): " + resultadoOr);

        // 4. Operador NÃO (NOT) -> ! (Inverte o valor booleano)
        boolean resultadoNao = !cond2;
        System.out.println("NÃO cond2 (!cond2): " + resultadoNao);

        // 5. Exemplo combinado com as três variáveis
        boolean combinada = (cond1 || cond2) && cond3;
        System.out.println("(cond1 OU cond2) E cond3: " + combinada);
    }
            }