package scText1;

import java.util.Scanner;

public class P3_SimpleSwitch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick 20 for arithmetic demo:");
        int choice = sc.nextInt();

        switch (choice) {
            case 20:
                System.out.println("This is Java!");
                break;
            case 21:
                System.out.println("Arithmetic demo coming up!");
                break;
            default:
                System.out.println("Try 21 next time.");
        }
        sc.close();
    }
}
