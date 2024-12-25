import java.util.Scanner;

public class CUninterestingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            String s = Long.toString(n);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            // ArrayList<Long> al = new ArrayList<>();
            long[] a = new long[(int) n];
            for (int i = 0; i < s.length(); i++) {
                a[i] = ((long) s.charAt(i) - '0');
            }

            if (fun(a, 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean fun(long[] a, int idx) {
        if (idx == a.length) {
            return fun2(a);
        }
        long original = a[idx];
        if (a[idx] == 3) {
            a[idx] = 9;
            if (fun(a, idx + 1)) {
                return true;
            }
            a[idx] = original; // Backtrack
        }

        // If the current value is 2, replace it with 4 and recurse
        if (a[idx] == 2) {
            a[idx] = 4;
            if (fun(a, idx + 1)) {
                return true;
            }
            a[idx] = original; // Backtrack
        }

        // Otherwise, proceed without modifying the current element
        if (fun(a, idx + 1)) {
            return true;
        }

        return false;
    }

    public static boolean fun2(long[] arr) {
        int sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum % 9 == 0;
    }
}
