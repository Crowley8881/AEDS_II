import java.util.Scanner;

public class SomadigitoRecursiva {
    public static int contadig(int n) {
        if (n == 0) {
            return 0; // caso base
        }
        return (n % 10) + contadig(n / 10); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = scanner.nextInt();

        int resultado = contadig(N);

        System.out.println("Soma dos dígitos: " + resultado);

        scanner.close();
    }
}
