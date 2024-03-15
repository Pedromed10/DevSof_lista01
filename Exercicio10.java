public class Exercicio10 {

    public static void executar(){

    int numero = Prompt.lerInteiro("Digite um número de 1 a 5: ");

    switch(numero) {
        case 1:
            Prompt.imprimir("Um");
            break;
        case 2:
            Prompt.imprimir("Dois");
            break;
        case 3:
            Prompt.imprimir("Três");
            break;
        case 4:
            Prompt.imprimir("Quatro");
            break;
        case 5:
            Prompt.imprimir("Cinco");
            break;
        default:
            Prompt.imprimir("Número inválido!");
        }
    }
}
