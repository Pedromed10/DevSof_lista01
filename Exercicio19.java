public class Exercicio19 {

    public static void executar() {

        double raio = Prompt.lerDecimal("Digite o raio: ");
        double altura = Prompt.lerDecimal("Digite a altura: ");

        double volume = 3.14 * (raio * raio) * altura;

        Prompt.imprimir("O volume do cilindro é: " + volume);

    }
}
