package practice.forloops;

public class P5_DivisibleBy3
{
    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { // divisible by 3
                System.out.println(i + " is divisible by 3");
            }
        }
    }
}
