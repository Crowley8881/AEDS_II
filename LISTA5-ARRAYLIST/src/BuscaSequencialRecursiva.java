import java.util.ArrayList;
import java.util.List;

public class BuscaSequencialRecursiva {

    public static boolean buscaSequencialRecursiva(ArrayList<String> lista, String chave, int indiceAtual) {
        // Caso Base 1: Elemento não encontrado (lista vazia ou fim da lista)
        if (indiceAtual >= lista.size()) {
            return false;
        }

        // Caso Base 2: Elemento encontrado
        if (lista.get(indiceAtual).equals(chave)) {
            return true;
        }

        // Caso Recursivo: Chama a função para o próximo elemento
        return buscaSequencialRecursiva(lista, chave, indiceAtual + 1);
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Banana");
        lstring.add("Maçã");
        lstring.add("Laranja");
        lstring.add("Uva");

        String chave1 = "Laranja";
        String chave2 = "Abacaxi";

        System.out.println("\nBuscando '" + chave1 + "' (recursiva): " + buscaSequencialRecursiva(lstring, chave1, 0)); // Esperado: true
        System.out.println("Buscando '" + chave2 + "' (recursiva): " + buscaSequencialRecursiva(lstring, chave2, 0)); // Esperado: false
    }
}