import java.util.*;

class studentgrade {
    public static void main(String[] args) {
        System.out.println("Enter the marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        switch (marks) {
            case 10:
                System.out.println("fail");
                break;
            case 50:
                System.out.println("d grade");
                break;
            case 80:
                System.out.println("A grade");
                break;
            default:
                System.out.println("invalid");
        }

    }
}