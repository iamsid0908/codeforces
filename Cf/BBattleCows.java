import java.util.Scanner;

public class BBattleCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[(int) n];
            long[] a1 = new long[(int) n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int y = 0;
            for (long ele : a) {
                a1[y++] = ele;
            }

            int count = fun(n, k, a);
            int val2 = SwapWithIndexOne(n, k, a1);
            // System.out.println(val2);
            System.out.println(Math.max(val2, count));

        }
    }

    public static int fun(int n, int k, long[] a) {
        k--;
        long val = a[k];
        for (int i = 0; i < n; i++) {
            if (a[i] > val) {
                long temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                break;
            } else if (a[i] == val) {
                break;
            }
        }
        // System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (a[i] == val) {
                    count++;
                }
                long temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            } else if (a[i] < a[i + 1]) {
                if (a[i + 1] == val) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int SwapWithIndexOne(int n, int k, long[] a) {
        k--;
        long val = a[k];
        long temp = a[0];
        a[0] = a[k];
        a[k] = temp;

        // System.out.println(Arrays.toString(a));

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (a[i] == val) {
                    count++;
                }
                long temp1 = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp1;
            } else if (a[i] < a[i + 1]) {
                if (a[i + 1] == val) {
                    count++;
                }
            }
        }
        return count;
    }
}