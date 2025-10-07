package scText1;

import java.util.Scanner;

public class P2_ReadNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number (20-27): ");
        int choice = sc.nextInt();
        System.out.println("You typed: " + choice);
        sc.close();
    }
}
