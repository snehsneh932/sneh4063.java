// Program to remove all occurrences of a given character from input String
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char rem = sc.nextLine().charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) if (s.charAt(i) != rem) sb.append(s.charAt(i));
        System.out.println("Result: " + sb.toString());
        sc.close();
    }
}
