package practice.forloops;

public class P10_EvenOddCheck
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String type = (i % 2 == 0) ? "even" : "odd"; // ternary operator
            System.out.println(i + " is " + type);
        }

    }
}
