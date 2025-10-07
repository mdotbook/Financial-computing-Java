package fifteenIfElse;

public class Ex13_StockTrend
{
    public static void main(String[] args) {
        // 1. Declare the trend of the stock
        // Possible values: "up", "down", "flat"
        String trend = "up";

        // 2. Decide action based on trend
        // 2a. If trend is "up"
        if (trend.equals("up")) {
            System.out.println("Consider buying a Call option.");
            System.out.println("Strong buy signal!"); // Extra message
        }
        // 2b. If trend is "down"
        else if (trend.equals("down")) {
            System.out.println("Consider buying a Put option.");
        }
        // 2c. If trend is "flat"
        else if (trend.equals("flat")) {
            System.out.println("Hold the stock for now.");
        }
        // 2d. If input is invalid
        else {
            System.out.println("Invalid trend input.");
        }
    }
}



