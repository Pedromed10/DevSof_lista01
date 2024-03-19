public class Exercicio16 {

    public static void executar() {

        int nota1 = Prompt.lerInteiro("Digite a primeira nota: ");
        int nota2 = Prompt.lerInteiro("Digite a segunda nota: ");
        int nota3 = Prompt.lerInteiro("Digite a terceiro nota: ");

        int media = (nota1 + nota2 + nota3);

        Prompt.imprimir("A média é: " + media);
    }
}
