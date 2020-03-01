import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev[] = new String[a.length()];
        int size = a.length();
        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                rev[i] = a.substring(i, i + 1);
            } else {
                rev[i] = a.substring(i);
            }
        }
        String b = "";
        for (int i = size; i > 0 ; i--) {
            b = b + rev[i-1];
        }
        if (a.compareTo(b) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
