import java.util.*;

class validage {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        String eligible = (age >= 18) ? "eligible" : "noteligible";
        System.out.println(eligible);
    }
}
