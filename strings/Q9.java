// Program to Check Anagram
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        System.out.print("Enter second string: ");
        String b = sc.nextLine().replaceAll("\\s+","").toLowerCase();
        if (a.length() != b.length()) { System.out.println("Not anagram"); sc.close(); return; }
        char[] x = a.toCharArray(); char[] y = b.toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        System.out.println(Arrays.equals(x,y) ? "Anagram" : "Not anagram");
        sc.close();
    }
}
