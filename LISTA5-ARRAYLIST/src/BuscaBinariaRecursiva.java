import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaBinariaRecursiva {

    public static boolean buscaBinariaRecursiva(ArrayList<String> lista, String chave, int inicio, int fim) {
        // Caso Base 1: Elemento não encontrado
        if (inicio > fim) {
            return false;
        }

        int meio = inicio + (fim - inicio) / 2;
        int comparacao = chave.compareTo(lista.get(meio));

        if (comparacao == 0) { // Elemento encontrado
            return true;
        } else if (comparacao < 0) { // Chave é menor, busca na metade esquerda
            return buscaBinariaRecursiva(lista, chave, inicio, meio - 1);
        } else { // Chave é maior, busca na metade direita
            return buscaBinariaRecursiva(lista, chave, meio + 1, fim);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Uva");
        lstring.add("Banana");
        lstring.add("Maçã");
        lstring.add("Laranja");

        Collections.sort(lstring); // A lista DEVE estar ordenada
        System.out.println("\nLista ordenada para busca binária recursiva: " + lstring);

        String chave1 = "Maçã";
        String chave2 = "Pera";

        System.out.println("Buscando '" + chave1 + "' (recursiva): " + buscaBinariaRecursiva(lstring, chave1, 0, lstring.size() - 1)); // Esperado: true
        System.out.println("Buscando '" + chave2 + "' (recursiva): " + buscaBinariaRecursiva(lstring, chave2, 0, lstring.size() - 1)); // Esperado: false
    }
}