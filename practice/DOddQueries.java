
import java.util.*;

public class DOddQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];
            int[] pre = new int[n + 1];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            pre[0] = 0;
            for (int i = 1; i <= n; i++) {
                pre[i] = arr[i - 1] + pre[i - 1];

            }

            ArrayList<Long> al = new ArrayList<>();
            for (long i = 0; i < q; i++) {
                al.add(sc.nextLong());
                al.add(sc.nextLong());
                al.add(sc.nextLong());
            }
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            // System.out.println(Arrays.toString(pre));
            for (long i = 0; i < al.size(); i = i + 3) {
                long summ = sum;
                long l = al.get((int) i);
                long r = al.get((int) i + 1);
                long k = al.get((int) i + 2);
                long ksum = k * (r - l + 1);
                // r = r - 1;
                // l = l - 1;
                // System.out.println(l);
                long sum2 = pre[(int) r] - pre[(int) l - 1];
                // for (long j = l - 1; j < r; j++) {
                //     sum2 = sum2 + arr[(int) j];
                // }
                long diff = (ksum - sum2);
                summ = summ + diff;
                // diff = Math.abs(diff);
                if (summ % 2 == 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}
