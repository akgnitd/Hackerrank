import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        reverseBasic(text);
        reverse(text);

    }

    private static void reverse(String text) {

        System.out.println(text.equals(new StringBuilder(text).reverse().toString()) ? "Yes" : "No");
    }

    private static void reverseBasic(String text) {
        int size = text.length();

        String rev[] = new String[size];
        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                rev[i] = text.substring(i, i + 1);
            } else {
                rev[i] = text.substring(i);
            }
        }
        String reverseText = "";
        for (int i = size; i > 0; i--) {
            reverseText = reverseText + rev[i - 1];
        }
        if (text.compareTo(reverseText) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
