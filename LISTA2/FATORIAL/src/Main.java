import javax.swing.plaf.PanelUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

     public  static  int fatorial(int num)
     {
         int fat = 1;
         int n = 1;
         if (num > 20){
            throw  new ArithmeticException("numero maior que 20");
         }
         else {
             while (++n <= num) {
                 fat *= n;
             }
             return fat;

         }
     }
    public static void main(String[] args) {
        try {
            System.out.println(fatorial(21));

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}