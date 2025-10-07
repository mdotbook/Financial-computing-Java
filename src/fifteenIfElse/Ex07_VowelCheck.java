package fifteenIfElse;

public class Ex07_VowelCheck {
    public static void main(String[] args) {
        // 1. Declare character
        char ch = 'A';

        // 2. Check lowercase and uppercase vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }
        // 3. Otherwise, it's not a vowel
        else {
            System.out.println("Not a vowel");
        }
    }
}

