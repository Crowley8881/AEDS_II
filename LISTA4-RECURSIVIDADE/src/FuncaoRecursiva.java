import java.util.Scanner;

public class FuncaoRecursiva {
    public static int T(int n) {
        // Condições iniciais
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        // Passo recursivo
        return T(n - 1) * T(n - 2) - T(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira valor de n");
        int n = scanner.nextInt();
        int resultado = T(n);

        System.out.println("resultado " + resultado);
        scanner.close();
    }
}