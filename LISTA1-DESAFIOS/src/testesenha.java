import java.util.Scanner;

public class testesenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "";

        do {
            System.out.println("Insira a senha:");

            palavra = scanner.nextLine();

            if (palavra.equals("alfa")) {
                System.out.println("Senha correta");
            } else {
                System.out.println("Senha incorreta");
            }

        } while (!palavra.equals("alfa"));

        scanner.close();

    }
}
