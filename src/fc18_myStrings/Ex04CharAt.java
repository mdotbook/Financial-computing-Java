package fc18_myStrings;

public class Ex04CharAt {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "java";

        // 2. Use charAt() method to get the character at a specific index
        //    Index counting starts from 0: J=0, a=1, v=2, a=3
        char ch = text.charAt(2);

        System.out.println("Character at index 2:" + ch);


    }
}
