package practice.forloops;

public class P4_OddNumbers
{
    public static void main(String[] args) {

        // Loop 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // if remainder is not 0, it's odd
                System.out.println(i + " is odd");
            }
        }

    }
}
