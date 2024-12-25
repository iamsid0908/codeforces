import java.util.Scanner;

public class BMakeThreeRegions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            char[][] arr = new char[2][n];
            arr[0] = sc.next().toCharArray();
            arr[1] = sc.next().toCharArray();

            int ans = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < n - 1; j++) {
                    if (i == 0) {
                        if (arr[i][j] == '.' && arr[i][j - 1] == '.' && arr[i][j + 1] == '.' && arr[i + 1][j] == '.'
                                && arr[i + 1][j - 1] == 'x'
                                && arr[i + 1][j + 1] == 'x') {
                            ans++;
                        }
                    } else {
                        if (arr[i][j] == '.' && arr[i][j - 1] == '.' && arr[i][j + 1] == '.' && arr[i - 1][j] == '.'
                                && arr[i - 1][j - 1] == 'x'
                                && arr[i - 1][j + 1] == 'x') {
                            ans++;
                        }
                    }
                }

            }
            System.out.println(ans);
        }
    }
}
