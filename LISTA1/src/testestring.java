import java.util.Scanner;

public class testestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificação:");
        String texto = scanner.nextLine();



        if (texto.contains("@") && texto.contains(".")) {
            System.out.println("A string contém os caracteres '@' e '.'");
        } else if (texto.contains("@")) {
            System.out.println("A string contém o caractere '@', mas não o '.'");
        } else if (texto.contains(".")) {
            System.out.println("A string contém o caractere '.', mas não o '@'");
        } else {
            System.out.println("A string não contém os caracteres '@' nem '.'");
        }

        scanner.close();
    }
}
