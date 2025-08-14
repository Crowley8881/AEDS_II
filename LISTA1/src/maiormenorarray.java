import  java.util.Scanner;

public class maiormenorarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero");

        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i =0; i < n;i++) {

            System.out.println("insira o valor de num");
            vetor[i] = scanner.nextInt();

       }


        int maior = 0;
        int menor = 0;


        for(int i = 1; i < n; i++){
            if (maior <= vetor[i]){
                maior = vetor[i];
            }
            else if (menor <= vetor[i]) {
                menor = vetor[i];
            }

        }

        System.out.println("maior e:"+ maior);
        System.out.println("menor e:"+ menor);







    }
}
