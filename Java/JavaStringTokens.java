import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
        scan.close();
    }
}

