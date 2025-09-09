import java.util.Scanner;

public class recursividadedivisor {
    public  static  int divide(int a,int b){
        if (a < b){
            return 0;
        }
        return 1+ divide(a-b, b);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite valor de A dividendo");
        int a = scanner.nextInt();

        System.out.println("digite valor de B divisor");
        int b = scanner.nextInt();

        int resultado = divide(a,b);

        System.out.println("resultado "+ resultado);
        scanner.close();
    }
}

