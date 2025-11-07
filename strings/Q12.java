// Program to Convert String to String Array
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        System.out.println("Array length: " + arr.length);
        for (int i=0;i<arr.length;i++) System.out.println(i + ": " + arr[i]);
        sc.close();
    }
}
