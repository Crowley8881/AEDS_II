import java.util.Scanner;
public class Digitosrecursividade {
    public static int contadig(int n) {
        if (n <= 0) {
            return n;
        }
        String numeroString = String.valueOf(n);
        int numerodig = numeroString.length();
        return numerodig;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int N = scanner.nextInt();
        int resultado = contadig(N);

        System.out.println("digitos: " + resultado);
        scanner.close();
    }
}
