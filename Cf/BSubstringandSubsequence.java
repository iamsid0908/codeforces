import java.util.Scanner;

public class BSubstringandSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String a = sc.next();
            String b = sc.next();

            int max = Integer.MIN_VALUE;

            int x = 0;
            while (x < b.length()) {
                int i = 0;
                int j = x;
                int ans = 0;
                while (i < a.length() && j < b.length()) {
                    if (a.charAt(i) == b.charAt(j)) {
                        ans++;
                        i++;
                        j++;
                    } else {
                        i++;
                    }
                }
                max = Math.max(max, ans);
                x++;
            }
            System.out.println(a.length() + b.length() - max);
        }
    }
}
