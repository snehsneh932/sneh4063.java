// Program to Convert Enum to String
public class Q11 {
    enum Day { MON, TUE, WED, THU, FRI }
    public static void main(String[] args) {
        Day d = Day.FRI;
        String s = d.toString();
        System.out.println("Enum to String: " + s);
    }
}
