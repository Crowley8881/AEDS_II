import java.util.ArrayList;
import java.util.List;

public class BuscaSequencial {

    public static boolean buscaSequencialIterativa(ArrayList<String> lista, String chave) {
        for (String elemento : lista) {
            if (elemento.equals(chave)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Banana");
        lstring.add("Maçã");
        lstring.add("Laranja");
        lstring.add("Uva");

        String chave1 = "Maçã";
        String chave2 = "Pera";

        System.out.println("\nBuscando '" + chave1 + "': " + buscaSequencialIterativa(lstring, chave1)); // Esperado: true
        System.out.println("Buscando '" + chave2 + "': " + buscaSequencialIterativa(lstring, chave2)); // Esperado: false
    }
}