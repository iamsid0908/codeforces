import java.util.Scanner;

public class CBoringDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long[] a = new long[n + 1];
            a[0] = 0;
            for (int i = 1; i < n + 1; i++) {
                a[i] = sc.nextLong();
            }
            // System.out.println(Arrays.toString(a));

            long pre[] = new long[n + 1];
            // pre[0] = 0;
            for (int i = 1; i < a.length; i++) {
                pre[i] = pre[i - 1] + a[i];
            }
            // System.out.println(Arrays.toString(pre));
            int i = 1;
            int count = 0;
            while (i < a.length) {
                if (a[i] >= l && a[i] <= r) {
                    count++;
                    i++;
                } else if (a[i] > r) {
                    i++;
                    continue;
                } else if (a[i] < l) {
                    int j = binarySearch(pre, i, l, r);

                    if (j != -1) {
                        count++;
                        i = j + 1; // Move i to j + 1 for the next search
                    } else {
                        i++;
                    }

                }
            }
            System.out.println(count);
        }
    }

    public static int binarySearch(long[] pre, int i, long l, long r) {
        int low = i, high = pre.length - 1;
        int resultIndex = -1;

        long prefixSum = pre[i - 1]; // This is pre[i-1]
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = pre[mid] - prefixSum;

            if (val >= l) {
                resultIndex = mid; // Store the candidate
                high = mid - 1; // Try to find a smaller index
            } else {
                low = mid + 1;
            }
        }

        // Check if the found value is within range [l, r]
        if (resultIndex != -1) {
            long finalVal = pre[resultIndex] - prefixSum;
            if (finalVal <= r) {
                return resultIndex; // Valid index
            }
        }

        return -1; // No valid index found
    }
}
