public class Exercicio13 {
    public static void executar() {
        double resultado = 0;

        double a = Prompt.lerDecimal("Digite o valor de A: ");
        double b = Prompt.lerDecimal("Digite o valor de B: ");
        char operador = Prompt.lerLinha("Digite o operador (+, -, *, /): ").charAt(0);

        if (operador == '+') {
            resultado = a + b;
        } else if (operador == '-') {
            resultado = a - b;
        } else if (operador == '*') {
            resultado = a * b;
        } else if (operador == '/') {
            if (b != 0) {
                resultado = a / b;
            } else {
                Prompt.imprimir("Erro: Divisão por zero.");
                return;
            }
        } else {
            Prompt.imprimir("Operador não definido.");
            return;
        }

        Prompt.imprimir("Resultado: " + resultado);
    }
}
