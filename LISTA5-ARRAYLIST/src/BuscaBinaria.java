import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaBinaria {

    public static boolean buscaBinariaIterativa(ArrayList<String> lista, String chave) {
        // A lista DEVE estar ordenada para a busca binária
        Collections.sort(lista);
        System.out.println("Lista ordenada para busca binária: " + lista);

        int inicio = 0;
        int fim = lista.size() - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2; // Evita overflow para listas muito grandes
            int comparacao = chave.compareTo(lista.get(meio));

            if (comparacao == 0) { // Elemento encontrado
                return true;
            } else if (comparacao > 0) { // Chave é maior, busca na metade direita
                inicio = meio + 1;
            } else { // Chave é menor, busca na metade esquerda
                fim = meio - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Uva");
        lstring.add("Banana");
        lstring.add("Maçã");
        lstring.add("Laranja");

        String chave1 = "Maçã";
        String chave2 = "Pera";

        System.out.println("\nBuscando '" + chave1 + "': " + buscaBinariaIterativa(lstring, chave1)); // Esperado: true
        System.out.println("Buscando '" + chave2 + "': " + buscaBinariaIterativa(lstring, chave2)); // Esperado: false
    }
}