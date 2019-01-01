import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
        int count = 0;
        while (scan.hasNext()) {
            count++;
            String i = scan.nextLine();
            System.out.println(count+" "+i);
        }

    }
}
