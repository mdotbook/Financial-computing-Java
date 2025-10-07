package scTest;

import java.util.Scanner;

public class FavoriteSentence
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favorite sentence: ");
        String sentence = input.nextLine(); // Reads whole line

        System.out.println("Your sentence is: " + sentence);
    }
}
