package fifteenIfElse;

public class ex01_AssetsLiabilitiesDecision
{
    public static void main(String[] args) {
        int assets = 100;
        int liabilities = 40;
        int equity = 40;

        System.out.println("Accounting Equation:"+ assets+"="+liabilities+"+"+ equity);

        // If-else to check if assets are greater than liabilities
        if (assets > liabilities) {
            System.out.println("Assets are greater than Liabilities");
        }
        else {
            System.out.println("Assets are not greater than liabilities");
        }
        // If-else to check equity status
        if (equity > 0) {
            System.out.println("Equity is positive");
        }
        else {
            System.out.println("Equity is negative");



        }


    }
}
