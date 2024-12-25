
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int k = sc.nextInt();
            long a[] = new long[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextLong();
            }
            HashSet<Integer> unavailable = new HashSet<>();
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                if (b <= n) {
                    unavailable.add(b);
                }
            }

            // Precompute available integers in [1, n] into a list
            ArrayList<Integer> availableIndices = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!unavailable.contains(i)) {
                    availableIndices.add(i);
                }
            }

            // Sort the available indices for binary search
            Collections.sort(availableIndices);

            // Check each element of array `a` using binary search
            StringBuilder result = new StringBuilder();
            for (long ele : a) {
                boolean found = false;

                // Binary search for any valid index that is not equal to `ele`
                int low = 0, high = availableIndices.size() - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int candidate = availableIndices.get(mid);

                    if (candidate == ele) {
                        // Skip this index
                        low = mid + 1;
                    } else {
                        // Valid candidate found
                        found = true;
                        break;
                    }
                }

                result.append(found ? "0" : "1");
            }

            // Print the result for this test case
            System.out.println(result);

        }
    }
}
