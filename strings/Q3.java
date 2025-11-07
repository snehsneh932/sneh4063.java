// Program to prove String is immutable programmatically
public class Q3 {
    public static void main(String[] args) {
        String s = "abc";
        String t = s;
        s = s + "d"; // creates new string object
        System.out.println("t = " + t); // remains "abc"
        System.out.println("s = " + s); // becomes "abcd"
    }
}
