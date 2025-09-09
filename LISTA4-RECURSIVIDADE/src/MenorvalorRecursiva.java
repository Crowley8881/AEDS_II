public class MenorvalorRecursiva {
    public static int busca(int[] vetor, int i, int menor, int posicao) {
        if (i >= vetor.length) {
            return posicao;
        }
        if (vetor[i] < menor) {
            menor = vetor[i];
            posicao = i;
        }
        return busca(vetor, i + 1, menor, posicao);
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20, 5, 40, 1, 50};
        int posicao = busca(vetor, 1, vetor[0], 0);

        System.out.println("O menor valor é " + vetor[posicao] + " encontrado na posição: " + posicao);
    }
}
