public class Exercicio15 {

    public static void executar() {

        double x1 = Prompt.lerDecimal("Digite a coordenada x do ponto P1: ");
        double y1 = Prompt.lerDecimal("Digite a coordenada y do ponto P1: ");
        double x2 = Prompt.lerDecimal("Digite a coordenada x do ponto P2: ");
        double y2 = Prompt.lerDecimal("Digite a coordenada y do ponto P2: ");

        double distancia = calcularDistancia(x1, y1, x2, y2);

        Prompt.imprimir("A distância entre os pontos P1 e P2 é: " + distancia);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;
        return Math.sqrt(diferencaX * diferencaX + diferencaY * diferencaY);
    }
}
