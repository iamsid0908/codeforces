import java.util.Arrays;
import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int maxDifference = Integer.MIN_VALUE;

            // Iterate over all subsets of days (2^n possible subsets)
            int totalSubsets = 1 << n; // 2^n
            for (int mask = 0; mask < totalSubsets; mask++) {
                int monocarpProblems = 0;
                int stereocarpProblems = 0;

                // Calculate Monocarp's problems for this subset
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) { // Check if day i is included in the subset
                        monocarpProblems += a[i];
                        if (i + 1 < n) { // Stereocarp trains the next day
                            stereocarpProblems += b[i + 1];
                        }
                    }
                }

                // Update the maximum difference
                maxDifference = Math.max(maxDifference, monocarpProblems - stereocarpProblems);
            }

            System.out.println(maxDifference);

        }
    }
}
