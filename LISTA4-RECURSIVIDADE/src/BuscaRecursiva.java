public class BuscaRecursiva {
    public static int busca(int[] vetor, int k, int i) {
        if (i >= vetor.length) {
            return -1;
        }
        if (vetor[i] == k) {
            return i;
        }
        return busca(vetor, k, i + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int k = 0;

        int posicao = busca(vetor, k, 0);

        if (posicao != -1) {
            System.out.println("Valor " + k + " encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor " + k + " não encontrado no vetor.");
        }
    }
}
