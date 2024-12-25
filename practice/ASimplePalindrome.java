import java.util.Arrays;
import java.util.Scanner;

public class ASimplePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            StringBuilder s = new StringBuilder();
            if (n >= 5) {
                StringBuilder s1 = new StringBuilder("aeiou");
                int count = n / 5;
                for (int i = 1; i <= count; i++) {
                    s.append("aeiou");
                }
                int count2 = n % 5;
                s.append(s1.substring(0, count2));
                // System.out.println(s);
                // Convert StringBuilder to char array
                char[] chars = s.toString().toCharArray();

                // Sort the char array
                Arrays.sort(chars);

                // Create a new sorted StringBuilder
                StringBuilder sortedSb = new StringBuilder(new String(chars));

                // Print the sorted result
                System.out.println(sortedSb);

            } else {
                String s1 = "aeiou";
                System.out.println(s1.substring(0, n));
            }
        }
    }
}
