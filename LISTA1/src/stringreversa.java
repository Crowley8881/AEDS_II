import java.util.Scanner;

public class stringreversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insira uma String");

        String palavra = scanner.nextLine();

        String reversa = new StringBuilder(palavra).reverse().toString();

        System.out.printf("nova string:" + reversa);

    }
}
