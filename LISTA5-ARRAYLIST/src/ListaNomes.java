import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {

    public static void adicionarNomes(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite os nomes a serem adicionados (digite 'STOP' para encerrar):");
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            if (!nome.equalsIgnoreCase("STOP")) {
                lista.add(nome);
            }
        } while (!nome.equalsIgnoreCase("STOP"));
        System.out.println("Inserção de nomes encerrada.");
    }

    public static void main(String[] args) {
        ArrayList<String> lstring = new ArrayList<>();
        adicionarNomes(lstring);
        System.out.println("Nomes na lista: " + lstring);
        // scanner.close(); // Em um ambiente real, o scanner deveria ser fechado, mas para este exemplo, pode ser omitido para evitar fechar System.in prematuramente.
    }
}