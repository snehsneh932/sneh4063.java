// Program to Check if a String contains only digits
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (s.length() == 0) {
            System.out.println("Empty string provided.");
            sc.close(); return;
        }
        boolean onlyDigits = true;
        for (int i=0;i<s.length();i++) {
            if (!Character.isDigit(s.charAt(i))) { onlyDigits = false; break; }
        }
        System.out.println(onlyDigits ? "String contains only digits." : "String contains non-digit characters.");
        sc.close();
    }
}
// Output example: input "12345" -> "String contains only digits."
