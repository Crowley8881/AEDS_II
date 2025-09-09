import java.util.Scanner;
public class ProgressaoGeometrica {
    // Função recursiva para calcular o n-ésimo termo da PG
    public static int termoPG(int a1, int r, int n) {
        if (n == 1) {
            return a1; // caso base
        }
        return r * termoPG(a1, r, n - 1); // chamada recursiva
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo (a1): ");
        int a1 = scanner.nextInt();

        System.out.print("Digite a razão (r): ");
        int r = scanner.nextInt();

        System.out.print("Digite o número do termo desejado (n): ");
        int n = scanner.nextInt();

        int resultado = termoPG(a1, r, n);

        System.out.println("O " + n + "º termo da PG é: " + resultado);

        scanner.close();
    }
}
