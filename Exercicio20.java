public class Exercicio20 {

    public static void executar() {
        double tempoViagemHoras = Prompt.lerDecimal("Digite o tempo de viagem (em horas): ");
        double velocidadeMediaKmPorHora = Prompt.lerDecimal("Digite a velocidade média (em km/h): ");

        double distanciaPercorrida = calcularDistancia(tempoViagemHoras, velocidadeMediaKmPorHora);

        double litrosCombustivel = calcularLitrosCombustivel(distanciaPercorrida);

        Prompt.imprimir("A quantidade de litros de combustível gasta é: " + litrosCombustivel);
    }

    public static double calcularDistancia(double tempoViagemHoras, double velocidadeMediaKmPorHora) {
        return tempoViagemHoras * velocidadeMediaKmPorHora;
    }

    public static double calcularLitrosCombustivel(double distanciaPercorrida) {
        final double consumoPorLitro = 12;
        return distanciaPercorrida / consumoPorLitro;
    }
}
