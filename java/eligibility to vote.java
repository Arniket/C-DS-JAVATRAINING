import java.util.*;

class ValidAge {
    public static void Main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        string eligible = (age >= 18) ? "eligible" : "noteligible";
        System.out.println(eligible);
    }
}
