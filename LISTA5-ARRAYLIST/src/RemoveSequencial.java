import java.util.ArrayList;
import java.util.List;

public class RemoveSequencial {

    public static void removerPrimeiraOcorrenciaSequencial(ArrayList<String> lista, String nomeParaRemover) {
        System.out.println("\nLista antes da remoção (sequencial): " + lista);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nomeParaRemover)) {
                lista.remove(i);
                System.out.println("Primeira ocorrência de '" + nomeParaRemover + "' removida.");
                System.out.println("Lista depois da remoção: " + lista);
                return; // Remove apenas a primeira ocorrência
            }
        }
        System.out.println("Nome '" + nomeParaRemover + "' não encontrado na lista.");
        System.out.println("Lista depois da tentativa de remoção: " + lista);
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Pedro");
        lstring.add("Ana");
        lstring.add("Maria");
        lstring.add("Pedro");
        lstring.add("João");

        removerPrimeiraOcorrenciaSequencial(lstring, "Pedro"); // Remove a primeira ocorrência de Pedro
        removerPrimeiraOcorrenciaSequencial(lstring, "Carlos"); // Não encontra Carlos
        removerPrimeiraOcorrenciaSequencial(lstring, "Ana"); // Remove Ana
    }
}