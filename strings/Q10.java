// Program to check whether a string is a Palindrome
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        boolean pal = true;
        for (int i=0;i<s.length()/2;i++) if (s.charAt(i) != s.charAt(s.length()-1-i)) { pal = false; break; }
        System.out.println(pal ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}
