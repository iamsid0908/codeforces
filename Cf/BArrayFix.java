import java.util.Scanner;

public class BArrayFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                s.append(Long.toString(a[i]));
            }
            if (isSorted(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isSorted(StringBuilder sb) {
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) < sb.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
