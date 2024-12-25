import java.util.Scanner;

public class BRakhshRevival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long m = sc.nextLong();
            long k = sc.nextLong();
            String s = sc.next();
            int x = 0;
            long i = 0;
            int ans = 0;
            while (i < s.length()) {
                if (s.charAt((int) i) == '0') {
                    x++;
                } else {
                    x = 0;
                }
                if (x == m) {
                    ans++;
                    i = i + k;
                    x = 0;
                } else {
                    i++;
                }
            }
            if (x == m) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}
