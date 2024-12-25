import java.util.Scanner;

public class BFunGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            // String ans="Yes";
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0' && r.charAt(i) != '0') {
                    // System.out.println("No");
                    ans = true;
                    // break;
                }
                if (s.charAt(i) == '1') {
                    break;
                }
            }
            if (ans) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }

    public static int fun(String s) {
        int x = 0;
        for (char c : s.toCharArray()) {
            x ^= (c - '0');
        }
        return x;
    }
}
