package scText2;

public class IncrementInExpression
{
    public static void main(String[] args) {
        int c = 5;
        int d = c++ + 10; // c used first, then increments
        System.out.println("d:" + d); //prints 15
        System.out.println("c:" + c); //prints 6
    }
}
