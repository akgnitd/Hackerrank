import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] str = new String[s.length() - k+1];
        for (int i = 0; i < s.length(); i++) {
            if (i + k <= s.length()) {
                str[i] = s.substring(i, i + k);
            }
        }
        String temp;
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                // comparing adjacent strings
                if (str[i].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            if (j == 0) {
                smallest = str[j];
            }
            if (j == str.length - 1) {
                largest = str[j];
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
