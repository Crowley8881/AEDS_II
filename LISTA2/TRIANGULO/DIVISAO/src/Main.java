//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static  double divisao(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Erro: Não existe divisão por zero!");
        }
        return  (double) a/b;
    }
    public static void main(String[] args) {
        try {
            double d = divisao(4,2);
            System.out.println(d);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }




    }
}