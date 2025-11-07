// Program to count number of words in a String
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine().trim();
        if (s.isEmpty()) System.out.println(0);
        else System.out.println(s.split("\\s+").length);
        sc.close();
    }
}
