package fifteenIfElse;

public class Ex01_PositiveNegative
{
    public static void main(String[] args) {
         int assets = 100;
         int liabilities = 40;
         int equity = assets - liabilities;

         if (assets > liabilities) {
             System.out.println("The number is positive");
         } else if (assets == liabilities) {
             System.out.println("The number is negative");
         }else {
             System.out.println("The number is zero");

         }




    }
}
