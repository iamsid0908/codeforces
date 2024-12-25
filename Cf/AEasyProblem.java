
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            // Input array
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Use HashSet for faster uniqueness checking
            HashSet<Long> hs = new LinkedHashSet<>();
            long max = 0;
            long min = Long.MAX_VALUE;

            // Fill hs and calculate max and min
            for (int i = 0; i < a.length; i++) {
                hs.add(a[i]);
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }

            // Create the 'not' list containing missing numbers
            ArrayList<Long> not = new ArrayList<>();
            for (long i = 1; i <= n; i++) {
                if (!hs.contains(i)) {
                    not.add(i);
                }
            }

            // Prepare the result list
            ArrayList<Long> al = new ArrayList<>(hs); // Start with all unique elements

            // Add missing numbers (no need for binary search, just append)
            al.addAll(not);

            // Print the result
            for (long ele : al) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}
