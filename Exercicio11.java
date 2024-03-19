public class Exercicio11 {

    public static void executar() {

        int num1 = Prompt.lerInteiro("Digite um numero: ");
        int num2 = Prompt.lerInteiro("Digite um numero: ");
        int num3 = Prompt.lerInteiro("Digite um numero: ");

        int menor, meio, maior;
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }
        Prompt.imprimir("A ordem crescente é: " + menor + meio + maior);
    }
}