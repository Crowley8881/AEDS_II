public class
Main {
    public  static  int fatorial(int numero) {
        int fat = 1;
        int n = 1;
        while (++n <= numero){
            fat *= n;
            throw new IllegalArgumentException("o faotrial esta definido");
        }
        return  fat;
    }

    public static void main(String[] args) {

        System.out.println(fatorial(10));



    }
}