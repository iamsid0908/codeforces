import java.util.Scanner;

public class CSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int[][] freA = new int[26][n];
            int[][] freB = new int[26][n];
            for (int i = 0; i < n; i++) {
                freA[a.charAt(i) - 'a'][i]++;
            }
            for (int i = 0; i < n; i++) {
                freB[b.charAt(i) - 'a'][i]++;
            }

            // Compute prefix sums
            for (int i = 0; i < 26; i++) {
                for (int j = 1; j < n; j++) {
                    freA[i][j] += freA[i][j - 1];
                    freB[i][j] += freB[i][j - 1];
                }
            }
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int diff = 0;

                for (int j = 0; j < 26; j++) {
                    int countOfA = freA[j][r];
                    int countOfB = freB[j][r];
                    if (l > 0) {
                        countOfA -= freA[j][l - 1];
                        countOfB -= freB[j][l - 1];
                    }

                    diff += Math.abs(countOfA - countOfB);
                }

                int cnt = diff / 2;
                System.out.println(cnt);
            }
        }
    }
}
