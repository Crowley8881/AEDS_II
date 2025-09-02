public class Triangulo {
    // Constantes para os tipos de triângulo
    public static final int EQUILATERO = 0;
    public static final int ISOSCELES = 1;
    public static final int ESCALENO = 2;

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) throws TrianguloInvalidoError {
        // Validação dos lados
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new TrianguloInvalidoError("Todos os lados devem ser maiores que zero.");
        }

        // Validação da desigualdade triangular
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new TrianguloInvalidoError("Os lados não satisfazem a desigualdade triangular.");
        }

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int determinarTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return EQUILATERO;
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return ISOSCELES;
        } else {
            return ESCALENO;
        }
    }


}