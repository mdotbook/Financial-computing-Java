package fifteenIfElse;

import javax.swing.*;

public class Ex02_EvenOdd
{
    public static void main(String[] args) {
        // 1. Declare a number variable
        int number = 7;

        // 2. Check if the number is zero
        if (number == 0) {
            System.out.println("Zero"); // 2a. Print if number is zero
        }
        // 3. Check if number is divisible by 2
        else if (number % 2 == 0) {
            System.out.println("Even number"); // 3a. Print if even
        }
        // 4. If not zero or even, it must be odd
        else {
            System.out.println("Odd number"); // 4a. Print if odd

        }
    }
}
