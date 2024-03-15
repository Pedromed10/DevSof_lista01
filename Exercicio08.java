public class Exercicio08 {
    
    public static void executar(){

    int numero = Prompt.lerInteiro("Digite um numero: ");

    if (numero >= 50){
        Prompt.imprimir("O número é maior ou igual a 50: ");
    } else{
        Prompt.imprimir("O numero é menor ou igual a 50: ");
    }
}

}
