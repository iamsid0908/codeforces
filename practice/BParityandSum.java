import java.util.Arrays;
import java.util.Scanner;

public class BParityandSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int counteven = 0;
            int countodd = 0;
            long maxodd = 0;
            long maxeven = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    countodd++;
                    maxodd = Math.max(maxodd, arr[i]);
                } else {
                    counteven++;
                    maxeven = Math.max(maxeven, arr[i]);
                }
            }
            if (counteven == 0 || countodd == 0) {
                System.out.println(0);
                continue;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    if (arr[i] < maxodd) {
                        maxodd = maxodd + arr[i];
                        ans++;
                    } else {
                        maxodd = maxodd + (2 * maxeven);
                        ans = ans + 2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}