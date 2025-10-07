package fifteenIfElse;

public class Ex12_PutOption
{
    public static void main(String[] args) {
        // 1. Declare current stock price
        double stockPrice = 95;

        // 2. Declare strike price of the put option
        double strikePrice = 100;

        // 3. Check different cases
        // 3a. If stock price is lower than strike price → profitable
        if (stockPrice < strikePrice) {
            System.out.println("Put option is profitable!");
        }
        // 3b. If stock price equals strike price → at the money
        else if (stockPrice == strikePrice) {
            System.out.println("Put option is at the money.");
        }
        // 3c. If stock price is higher → out of the money
        else {
            System.out.println("Put option is out of the money.");
        }
    }
}
