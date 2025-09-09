import java.util.Scanner;

public class ExponencialRecursiva {
    public  static  int exponencial(int a, int b){
        if (a == 0 || b==0){
            return 0;
        }
        return a * exponencial(a, b - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite valor de numero");
        int a = scanner.nextInt();

        System.out.println("digite valor de exponente");
        int b = scanner.nextInt();

        int resultado = exponencial(a,b);

        System.out.println("resultado "+ resultado);
        scanner.close();
    }
}


