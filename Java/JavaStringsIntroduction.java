import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next().trim();
        String b = sc.next().trim();

        System.out.println(a.length() + b.length());
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else System.out.println("No");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));

    }
}
