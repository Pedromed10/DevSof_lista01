public class Exercicio03 {

    public static void executar(){

    int a = Prompt.lerInteiro("Digite o valor de A: ");
    int b = Prompt.lerInteiro("Digite o valor de B: ");

    if (a > b) {
        Prompt.imprimir("O maior número é:; " + a);
    } else {
        Prompt.imprimir("O maior número é: " + b);
    } if (a == b) {
        Prompt.imprimir("A sequência de números informados é inválida.");
    }
    
}
}