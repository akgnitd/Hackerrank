import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int integerInput = sc.nextInt();

        for (int i = 0; i < integerInput; i++) {
            try {
                long longInput = sc.nextLong();
                System.out.println(longInput + " can be fitted in:");
                if (longInput >= -128 && longInput <= 127) System.out.println("* byte");
                if (longInput >= -32768 && longInput <= 32767) System.out.println("* short");
                if (longInput >= -Math.pow(2, 31) && longInput <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (longInput >= -Math.pow(2, 63) && longInput <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
