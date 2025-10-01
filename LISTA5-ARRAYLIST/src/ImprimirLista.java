import java.util.ArrayList;
import java.util.List;

public class ImprimirLista {

    public static void imprimirValores(ArrayList<String> lista) {
        System.out.println("\nValores na lista:");
        for (String valor : lista) {
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        lstring.add("Alice");
        lstring.add("Bob");
        lstring.add("Charlie");
        imprimirValores(lstring);
    }
}