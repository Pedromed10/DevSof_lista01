public class Exercicio06 {
    
    public static void executar(){
    
    double Celsius = Prompt.lerDecimal("Digite a temperatura em graus Celsius: ");

    double Fahrenheit = (9 * Celsius + 160) / 5;

    Prompt.imprimir("A temperatura em graus Fahrenheit é: " + Fahrenheit);

    }
}