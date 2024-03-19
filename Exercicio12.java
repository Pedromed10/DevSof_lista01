public class Exercicio12 {

    public static void executar() {

        int numeroMes = Prompt.lerInteiro("Digite o numero do mês: ");

        if (numeroMes == 1) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Janeiro");
        } else if (numeroMes == 2) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Fevereiro");
        } else if (numeroMes == 3) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Março");
        } else if (numeroMes == 4) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Abril");
        } else if (numeroMes == 5) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Maio");
        } else if (numeroMes == 6) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Junho");
        } else if (numeroMes == 7) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Julho");
        } else if (numeroMes == 8) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Agosto");
        } else if (numeroMes == 9) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Setembro");
        } else if (numeroMes == 10) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Outubro");
        } else if (numeroMes == 11) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Novembro");
        } else if (numeroMes == 12) {
            Prompt.imprimir("O mês correspondente ao número " + numeroMes + " é: Dezembro");
        } else {
            Prompt.imprimir("Número de mês inválido. Por favor, insira um número entre 1 e 12.");
        }
    }
}
