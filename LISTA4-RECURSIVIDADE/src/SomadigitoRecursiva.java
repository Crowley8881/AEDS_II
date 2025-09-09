import java.util.Scanner;

public class SomadigitoRecursiva  {
    public static int contadig(int n) {
        int soma =0;
        if (n <= 0) {
            return n;
        }
        String numeroString = String.valueOf(n);
        for (int i=0; i < numeroString.length(); i++) {
            int numerodig = numeroString.charAt(i);
            soma += Character.getNumericValue(numerodig);
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int N = scanner.nextInt();
        int resultado = contadig(N);

        System.out.println("Soma dig: " + resultado);
        scanner.close();
    }
}

