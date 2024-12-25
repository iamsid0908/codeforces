import java.util.Arrays;
import java.util.Scanner;

public class CHardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long y = sc.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long sum = 0;
            for (long ele : a) {
                sum = sum + ele;
            }
            Arrays.sort(a);
            long count = 0;
            for (int i = 0; i < n; i++) {
                long val1 = sum - a[i];
                int idx = -1;
                int idx1 = -1;
                int s = i + 1, e = n + 1;
                while (s + 1 < e) {
                    int mid = s + (e - s) / 2;
                    if (val1 - a[mid] >= x && val1 - a[mid] <= y) {
                        idx = mid;
                        e = mid;
                    } else if (val1 - a[mid] < x) {
                        e = mid;
                    } else {
                        s = mid;
                    }
                }
                s = i + 1;
                e = n;
                while (s + 1 < e) {
                    int mid = s + (e - s) / 2;
                    if (val1 - a[mid] >= x && val1 - a[mid] <= y) {
                        idx1 = mid;
                        s = mid;
                    } else if (val1 - a[mid] < x) {
                        e = mid;
                    } else {
                        s = mid;
                    }
                }
                if (idx != -1 && idx1 != -1) {
                    count = count + (idx1 - idx + 1);
                }
                // val1 = val1 + a[i];
            }
            System.out.println(count);

        }

    }

    // public static int fun(int l, int n, long[] a) {
    // int low = l;
    // int high = n - 1;
    // while (low <= high) {

    // }
    // }

    public static int lowerBound(long[] array, long target) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    // Binary search for the last index where array[index] <= target
    public static int upperBound(long[] array, long target) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

}
