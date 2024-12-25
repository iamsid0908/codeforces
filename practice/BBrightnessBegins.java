import java.util.Scanner;

public class BBrightnessBegins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong(); // Input k
            long l = 1, r = (long) 2e18;

            while (r - l > 1) {
                long mid = (l + r) / 2; // Calculating mid
                long n = mid - (long) Math.sqrt(mid); // n = mid - sqrt(mid)

                if (n >= k) {
                    r = mid; // Update r
                } else {
                    l = mid; // Update l
                }
            }

            System.out.println(r); // Output result
            // cout << k + int(sqrtl(k) + 0.5) << "\n";
            System.out.println(k + (long) (Math.sqrt(k) + 0.5));

        }

    }
}
