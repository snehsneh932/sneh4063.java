// Program to Add Characters to a String (Q8)
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter characters to add: ");
        String add = sc.nextLine();
        // basic append
        String res = s + add;
        System.out.println("Result: " + res);
        sc.close();
    }
}
