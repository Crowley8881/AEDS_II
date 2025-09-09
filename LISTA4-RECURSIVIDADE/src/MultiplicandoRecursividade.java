import java.util.Scanner;

public class MultiplicandoRecursividade {
    public static int multiplicando(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicando(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de A (multiplicando): ");
        int a = scanner.nextInt();

        System.out.println("Digite valor de B (multiplicador): ");
        int b = scanner.nextInt();

        int resultado = multiplicando(a, b);

        System.out.println("Resultado = " + resultado);

        scanner.close();
    }
}
