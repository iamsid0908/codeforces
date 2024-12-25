import java.lang.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Length of array
            int K = sc.nextInt(); // Divisor

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Variables to track the sum range
            int minSum = 0; // Sum if all B[i] = floor(A[i] / K)
            int maxSum = 0; // Sum if all B[i] = ceil(A[i] / K)

            for (int i = 0; i < N; i++) {
                int floor = (int) Math.floor((double) A[i] / K);
                int ceil = (int) Math.ceil((double) A[i] / K);

                // Add to minSum and maxSum
                minSum += floor;
                maxSum += ceil;
            }

            // Check if it's possible to balance the sum to 0
            if (minSum <= 0 && maxSum >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
