package fc18_myStrings;

public class Ex05Substring {
    public static void main(String[] args) {
        // 1. Declare a String variable
        String text = "Programming";

        // 2. Use substring(start, end) to get part of the string
        //    start index is inclusive, end index is exclusive
        String part = text.substring(3, 7);

        System.out.println(part);


    }
}