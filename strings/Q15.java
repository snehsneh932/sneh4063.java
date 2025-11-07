// Program to count the total number of punctuation characters exists in a String
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String punct = "!.,;:?-'\"()[]{}";
        int count = 0;
        for (int i=0;i<s.length();i++) if (punct.indexOf(s.charAt(i)) >= 0) count++;
        System.out.println("Punctuation count: " + count);
        sc.close();
    }
}
