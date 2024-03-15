public class Exercicio07 {

    public static void executar(){
    
    int numero = Prompt.lerInteiro("Digite um número: ");

    if (numero >= 100 && numero <= 200) {
            Prompt.imprimir("O número está dentro do intervalo entre 100 e 200.");
        } else{
            Prompt.imprimir("O número está fora do intervalo entre 100 e 200.");
        }
    }
}