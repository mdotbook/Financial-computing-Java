package fc18_myStrings;

public class Ex11IndexOf
{
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "banana";

        // 2. Use indexOf(char) to find the first occurrence of a character
        int indexChar = text.indexOf('a');

        // 3. Use indexOf(String) to find the first occurrence of a substring
        int indexStr = text.indexOf("na");

        System.out.println("Index of 'a': " + indexChar);
        System.out.println("Index of \"na\": " + indexStr);


    }

}
