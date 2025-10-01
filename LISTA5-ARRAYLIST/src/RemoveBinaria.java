import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveBinaria {

    public static void removerPrimeiraOcorrenciaBinaria(ArrayList<String> lista, String nomeParaRemover) {
        Collections.sort(lista);
        System.out.println("\nLista ordenada para busca binária: " + lista);
        int index = Collections.binarySearch(lista, nomeParaRemover);
        if (index >= 0) {
            while (index > 0 && lista.get(index - 1).equals(nomeParaRemover)) {
                index--;
            }
            lista.remove(index);
            System.out.println("Primeira ocorrência de '" + nomeParaRemover + "' removida (busca binária).");
            System.out.println("Lista depois da remoção: " + lista);
        } else {
            System.out.println("Nome '" + nomeParaRemover + "' não encontrado na lista.");
            System.out.println("Lista depois da tentativa de remoção: " + lista);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("João");
        lstring.add("Ana");
        lstring.add("Maria");
        lstring.add("João");
        lstring.add("Pedro");
        lstring.add("Ana");

        removerPrimeiraOcorrenciaBinaria(lstring, "João"); // Remove a primeira ocorrência de João
        removerPrimeiraOcorrenciaBinaria(lstring, "Carlos"); // Não encontra Carlos
        removerPrimeiraOcorrenciaBinaria(lstring, "Ana"); // Remove a primeira ocorrência de Ana
    }
}