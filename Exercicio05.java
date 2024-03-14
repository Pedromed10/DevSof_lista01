public class Exercicio05 {
    
    public static void executar(){
    
        double a = Prompt.lerDecimal("Digite o primeiro número: ");
        double b = Prompt.lerDecimal("Digite o segundo número: ");

        double d = a;
        a = b; 
        b = d;

        Prompt.imprimir("A ordem correta:  " + d + " e " + a);
        Prompt.imprimir("A ordem Trocada:  " + a + " e " + b);
    }
}