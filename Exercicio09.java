public class Exercicio09 {

    public static void executar(){

    int a = Prompt.lerInteiro("Digite o primeiro número: ");
    int b = Prompt.lerInteiro("Digite o segundo número: ");

    if (a == b){
        Prompt.imprimir("Os números sao iguais. ");
    } else if(a > b) {
        Prompt.imprimir("Os números sao diferentes. O primeiro número é maior que o segundo número. ");
    } else{
        Prompt.imprimir("Os números sao diferentes. O segundo número é maior que o primeiro número. ");
    }
    
    }
}
