package practice.forloops;

public class P7_SumNumbers
{
    public static void main(String[] args) {

        int sum = 0; // start sum at 0

        for (int i = 1; i <= 5; i++) {
            sum += i; // add current number to sum
        }

        System.out.println("Sum of 1 to 5 is: " + sum);

    }
}
