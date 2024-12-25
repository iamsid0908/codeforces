import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DRightLeftWrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            String s = sc.next();
            ArrayList<Integer> l = new ArrayList<>();
            ArrayList<Integer> r = new ArrayList<>();
            StringBuilder sb = new StringBuilder(s);
            int i = 0;
            int j = s.length() - 1;
            while (i <= j) {
                if (s.charAt(i) == 'L' && s.charAt(j) == 'R') {
                    l.add(i);
                    r.add(j);
                    i++;
                    j--;
                } else if (s.charAt(i) == 'R' && s.charAt(j) == 'R') {
                    i++;
                } else if (s.charAt(i) == 'L' && s.charAt(j) == 'L') {
                    j--;
                } else {
                    i++;
                    j--;
                }
            }
            long sum = 0;
            long[] prefixSum = new long[a.length];
            prefixSum[0] = a[0];
            for (int i1 = 1; i1 < a.length; i1++) {
                prefixSum[i1] = prefixSum[i1 - 1] + a[i1];
            }
            System.out.println(Arrays.toString(prefixSum));

            // Step 2: Use the prefix sum array to compute the sum for each range
            // long sum = 0;
            for (int x = 0; x < l.size(); x++) {
                int left = l.get(x);
                int right = r.get(x);
                sum += (left == 0) ? prefixSum[right] : (prefixSum[right] - prefixSum[left - 1]);
            }
            System.out.println(sum);
        }
    }
}