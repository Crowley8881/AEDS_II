import java.util.Scanner;

class ImpressaoInversaRecursiva {
    public static void imprimirInverso(int[] vetor, int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(vetor[n - 1] + " ");
        imprimirInverso(vetor, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int N = scanner.nextInt();

        int[] meuVetor = new int[N];

        System.out.println("Digite os " + N + " números do vetor:");
        for (int i = 0; i < N; i++) {
            meuVetor[i] = scanner.nextInt();
        }

        System.out.print("Vetor na ordem inversa: ");
        imprimirInverso(meuVetor, N);
        System.out.println();

        scanner.close();
    }
}