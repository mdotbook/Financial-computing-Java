package fifteenIfElse;

public class Ex05_DivisibleBy5
{
    public static void main(String[] args) {
        int number = 25;
        if (number % 10==0) {
            System.out.println("Divisible by 10 and 5");
        } else if (number%5==0) {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");

        }
    }

}
