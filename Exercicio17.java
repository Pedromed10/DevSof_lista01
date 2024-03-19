public class Exercicio17 {

    public static void executar() {

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");
        double peso3 = Prompt.lerDecimal("Digite o peso da terceira nota: ");

        double mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);

        Prompt.imprimir("A média ponderada do aluno é: " + mediaPonderada);
    }

    public static double calcularMediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3,
            double peso3) {
        double somaPesos = peso1 + peso2 + peso3;
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
    }
}
