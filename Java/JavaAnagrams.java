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
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();b = b.toLowerCase();
        int asciiA = 0, asciiB = 0;
        //ASCII Verification
        for (int i = 0; i < a.length(); i++) {
            asciiA = asciiA + (int) a.toCharArray()[i];
            asciiB = asciiB + (int) b.toCharArray()[i];
        }
        if (asciiA != asciiB) {
            return false;
        }
        //Characters presence verification
        for (int i = 0; i < a.length(); i++) {
            char aa = a.charAt(i);
            char bb = b.charAt(i);
            if (b.contains(Character.toString(aa)) && a.contains(Character.toString(bb))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
