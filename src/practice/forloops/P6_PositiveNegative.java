package practice.forloops;

public class P6_PositiveNegative
{
    public static void main(String[] args) {

        // Check 4 numbers manually (no arrays)
        int n1 = -2, n2 = 3, n3 = -1, n4 = 5;

        // Loop manually using a simple trick (repeat code block)
        for (int i = 1; i <= 4; i++) {
            int num = (i == 1) ? n1 : (i == 2) ? n2 : (i == 3) ? n3 : n4;

            if (num > 0) {
                System.out.println(num + " is positive");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

    }
}
