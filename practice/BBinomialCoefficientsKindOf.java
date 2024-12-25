import java.util.Scanner;

public class BBinomialCoefficientsKindOf {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // int mod = 1000000007;
        // int n[] = new int[t];
        // int k[] = new int[t];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Read X values but don't store them since they're not used
        for (int i = 0; i < n; i++) {
            sc.nextLong();
        }

        // Read Y values and calculate 2^Y for each
        for (int i = 0; i < n; i++) {
            long y = sc.nextLong();
            System.out.println((long) Math.pow(2, y) % 998244353);
        }

        // int[] arr = new int[100001];
        // arr[0] = 1;
        // for (int i = 1; i < arr.length; i++) {
        // arr[i] = (arr[i - 1] * 2) % ((int) (1e9) + 7);
        // }
        // for (int i = 0; i < t; i++)
        // sc.nextInt();
        // for (int i = 0; i < t; i++) {
        // int val = (int) Math.pow(2, sc.nextInt()) % ((int) (1e9) + 7);
        // System.out.println(val);
        // }

    }
}
