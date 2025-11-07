// Program to perform Deep Copy for String
public class Q2 {
    public static void main(String[] args) {
        String original = "Hello";
        // assignment copies reference, but strings are immutable
        String refCopy = original;
        // to force a new String object:
        String deepCopy = new String(original);
        System.out.println("original == refCopy? " + (original == refCopy));
        System.out.println("original == deepCopy? " + (original == deepCopy));
        System.out.println("original.equals(deepCopy)? " + original.equals(deepCopy));
    }
}
// Output: original == refCopy? true
//         original == deepCopy? false (likely)
//         original.equals(deepCopy)? true
