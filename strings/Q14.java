// Program to count the total number of characters in a string
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        System.out.println("Total characters (including spaces): " + s.length());
        sc.close();
    }
}
