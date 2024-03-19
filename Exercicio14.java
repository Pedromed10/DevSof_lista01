public class Exercicio14 {

    public static void executar() {

        double a1 = Prompt.lerDecimal("Digite o primeiro termo da Progressão Aritmética (a1): ");
        int n = Prompt.lerInteiro("Digite o número do termo desejado (n): ");
        double r = Prompt.lerDecimal("Digite a razão da Progressão Aritmética (r): ");

        double an = a1 + (n - 1) * r;

        Prompt.imprimir("O " + n + "-ésimo termo da Progressão Aritmética é: " + an);
    }
}
