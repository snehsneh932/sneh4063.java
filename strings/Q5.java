// Program to append the string using StringBuffer class
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base string: ");
        String base = sc.nextLine();
        System.out.print("Enter string to append: ");
        String app = sc.nextLine();
        StringBuffer sb = new StringBuffer(base);
        sb.append(app);
        System.out.println("After append: " + sb.toString());
        sc.close();
    }
}
