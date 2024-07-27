
import java.util.Random;

public class otpgenerate {
    public static void main(String[] args) {
        Random random = new Random();
        int myOTP = random.nextInt(100);
        System.out.println("your OTP IS :" + myOTP);
    }
}
