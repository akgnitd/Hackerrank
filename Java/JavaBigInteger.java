import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = sc.nextBigInteger();
        BigInteger bigInteger2 = sc.nextBigInteger();
        System.out.println(bigInteger.add(bigInteger2));
        System.out.println(bigInteger.multiply(bigInteger2));
    }
}
