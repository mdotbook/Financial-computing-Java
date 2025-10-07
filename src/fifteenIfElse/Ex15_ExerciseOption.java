package fifteenIfElse;

public class Ex15_ExerciseOption
{
    public static void main(String[] args) {
        // 1. Declare stock price
        double stockPrice = 105;

        // 2. Declare strike price
        double strikePrice = 100;

        // 3. Declare option type: can be "call" or "put"
        String optionType = "call";

        // 4. Check whether to exercise the option
        // 4a. If it's a Call option AND stockPrice > strikePrice
        if (optionType.equals("call") && stockPrice > strikePrice) {
            System.out.println("Exercise your Call option!");
        }
        // 4b. If it's a Put option AND stockPrice < strikePrice
        else if (optionType.equals("put") && stockPrice < strikePrice) {
            System.out.println("Exercise your Put option!");
        }
        // 4c. If stockPrice equals strikePrice (same for call or put)
        else if (stockPrice == strikePrice) {
            System.out.println("Option is at the money");
        }
        // 4d. Otherwise, do not exercise
        else {
            System.out.println("Do not exercise the option.");
        }
    }
}
