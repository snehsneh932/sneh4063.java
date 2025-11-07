// Program to insert the string using StringBuffer class
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base string: ");
        String base = sc.nextLine();
        System.out.print("Enter string to insert: ");
        String ins = sc.nextLine();
        System.out.print("Enter position (0-based): ");
        int pos = Integer.parseInt(sc.nextLine());
        StringBuffer sb = new StringBuffer(base);
        if (pos < 0) pos = 0;
        if (pos > sb.length()) pos = sb.length();
        sb.insert(pos, ins);
        System.out.println("Result: " + sb.toString());
        sc.close();
    }
}
