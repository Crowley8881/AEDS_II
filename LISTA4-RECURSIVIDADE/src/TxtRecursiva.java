import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


class TxtRecursiva {
    public static void imprimirInverso(int[] vetor, int n, PrintWriter writer) {
        if (n <= 0) {
            return;
        }
        writer.print(vetor[n - 1] + " ");
        imprimirInverso(vetor, n - 1, writer);
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

        try (PrintWriter writer = new PrintWriter(new FileWriter("saida.txt"))) {
            System.out.println("\nEscrevendo vetor na ordem inversa no arquivo 'saida.txt'...");

            imprimirInverso(meuVetor, N, writer);

            System.out.println("Arquivo 'saida.txt' criado com sucesso!");

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
        scanner.close();
    }
}