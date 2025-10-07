package fifteenIfElse;

public class Ex14_TargetProfit
{
    public static void main(String[] args) {
        // 1. Profit earned so far
        double profit = 50;
        // 2. Target profit goal
        double target = 100;

        // 3. Decision-making
        // 3a. Huge success if profit >= 2 * target
        if (profit >= 2 * target) {
            System.out.println("Huge success! Profit doubled your target!");
        }
        // 3b. If profit has reached target but is less than double
        else if (profit >= target) {
            System.out.println("Time to sell and take profit!");
        }
        // 3c. If profit is positive but below target
        else if (profit > 0) {
            System.out.println("Small profit, keep pushing!");
        }
        // 3d. If profit is negative
        else {
            System.out.println("Loss occurred, reconsider your strategy.");
        }
    }
}

