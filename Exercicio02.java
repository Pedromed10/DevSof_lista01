public class Exercicio02 {

    public static void executar(){

        int numero1 = Prompt.lerInteiro("Digite o primeiro numero: ");
        int numero2 = Prompt.lerInteiro("Digite o numero dois: ");

        int soma = numero1 + numero2;

        Prompt.imprimir("A soma dos números é: " + soma);
    }
}
