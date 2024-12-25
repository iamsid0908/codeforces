import java.util.HashSet;
import java.util.Scanner;

public class BInterceptedInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long k = sc.nextInt();
            long[] arr = new long[(int) k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
            }
            long o = k - 2;
            long idsx = 0;
            long idx = 0;
            HashSet<Long> set = new HashSet<>();

            for (int i = 0; i < k; i++) {
                if (arr[i] != 0 && o % arr[i] == 0) {
                    long complement = o / arr[i];
                    if (set.contains(complement)) {
                        idsx = arr[i];
                        idx = complement;
                        break;
                    }
                }
                set.add(arr[i]); // Add the current element to the set
            }
            // int max = arr[0];
            // int min = arr[0];
            // for (int i = 0; i < k; i++) {
            // min = Math.min(min, arr[i]);
            // max = Math.max(max, arr[i]);
            // }
            // if (idsx == 0 && idx == 0) {
            // System.out.println(max + " " + min);
            // } else {
            System.out.println(idsx + " " + idx);
            // }
        }
    }
}
