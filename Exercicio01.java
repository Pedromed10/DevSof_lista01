
public class Exercicio01 {

    public static void executar(){
        
        int numero = Prompt.lerInteiro("Digite um numero: ");
        
        if (numero > 10) {
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        } 
    }
}
