package practice.forloops;

public class P8_Factorial
{
    public static void main(String[] args) {

        int factorial = 1;

        for (int i = 1; i <= 5; i++) {
            factorial *= i; // multiply factorial by current number
        }

        System.out.println("5! = " + factorial);

    }
}
