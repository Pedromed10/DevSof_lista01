public class Exercicio04 {

    public static void executar(){

    int numero1 = Prompt.lerInteiro("Digite o primeiro número: ");
    int numero2 = Prompt.lerInteiro("Digite o segundo número: ");

    int soma = numero1 + numero2;
    int subtracao = numero1 - numero2;
    int multiplicacao = numero1 * numero2;
    double divisao = numero1 / numero2;

    Prompt.imprimir("A soma dos números é: " + soma);
    Prompt.imprimir("A subtração dos números é: " + subtracao);
    Prompt.imprimir("A multiplicação dos números é: " + multiplicacao);
    Prompt.imprimir("A divisão dos números é: " + divisao);

    }
}
