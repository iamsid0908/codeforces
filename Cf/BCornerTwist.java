import java.util.Scanner;

public class BCornerTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            char[][] a = new char[n][m], b = new char[n][m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next().toCharArray();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.next().toCharArray();
            }
            boolean loose = false;

            for (int i = 0; i < a.length; i++) {
                int suma = 0;
                int sumb = 0;
                for (int j = 0; j < a[i].length; j++) {
                    suma = suma + a[i][j] - '0';
                    sumb = sumb + b[i][j] - '0';
                }
                int val = Math.abs(suma - sumb);
                if (val % 3 != 0) {
                    loose = true;
                    break;
                }

            }
            boolean loose2 = false;

            for (int i = 0; i < a[0].length; i++) {
                int suma = 0;
                int sumb = 0;
                for (int j = 0; j < a.length; j++) {
                    suma = suma + a[j][i] - '0';
                    sumb = sumb + b[j][i] - '0';
                }
                int val = Math.abs(suma - sumb);
                if (val % 3 != 0) {
                    loose2 = true;
                    break;
                }
            }
            if (loose || loose2) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }

        }
    }
}
