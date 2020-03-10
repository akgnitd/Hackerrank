import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        String n = SCANNER.nextLine();
        BigInteger a = new BigInteger(n);

        if (a.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
