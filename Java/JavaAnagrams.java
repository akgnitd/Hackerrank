import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int size = a.length() > b.length() ? a.length() : b.length();
        int asciiA = 0, asciiB = 0;
        for (int i = 0; i < size; i++) {
            if (i < a.length()) {
                asciiA = asciiA + (int) a.toLowerCase().toCharArray()[i];
            }
            if (i < b.length()) {
                asciiB = asciiB + (int) b.toLowerCase().toCharArray()[i];
            }
        }
        if (asciiA == asciiB) {
            return true;
        } else {
            return false;
        }
    }
}
