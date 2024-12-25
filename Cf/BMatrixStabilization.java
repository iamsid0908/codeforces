import java.util.Scanner;

public class BMatrixStabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] mat = new int[n][m];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    int up = (i > 0) ? mat[i - 1][j] : 0; // Check if 'up' is valid
                    int down = (i < mat.length - 1) ? mat[i + 1][j] : 0; // Check if 'down' is valid
                    int left = (j > 0) ? mat[i][j - 1] : 0;
                    int right = (j < mat[0].length - 1) ? mat[i][j + 1] : 0;

                    int max = Math.max(up, Math.max(down, Math.max(left, right)));
                    if (max < mat[i][j]) {
                        mat[i][j] = max;
                    }
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
