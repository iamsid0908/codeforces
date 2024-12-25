import java.util.Scanner;

public class AEveryoneLovestoSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();

            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int homin = Integer.MAX_VALUE;
            int minmin = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                int h1 = arr[i][0];
                int m1 = arr[i][1];
                if (H <= h1 && M >= m1) {
                    m1 = m1 + 60;
                    h1 = h1 - 1;
                    // System.out.println((h1 - H) + " " + (m1 - M));
                    // homin = Math.min((homin), (h1 - H));
                    // minmin = Math.min((minmin), (m1 - M));
                    if ((h1 - H) < homin) {
                        homin = (h1 - H);
                        minmin = (m1 - M);
                    }
                } else if (H <= h1 && M < m1) {
                    // System.out.println((h1 - H) + " " + (m1 - M));
                    // homin = Math.min((homin), (h1 - H));
                    // minmin = Math.min((minmin), (m1 - M));
                    if ((h1 - H) < homin) {
                        homin = (h1 - H);
                        minmin = (m1 - M);
                    }
                } else if (H >= h1 && M > 0) {
                    int ho = h1 + (24 - (H + 1));
                    int min = m1 + (60 - M);
                    min = min % 60;
                    ho = ho + (min / 60);
                    // System.out.println(ho + " " + min);
                    // homin = Math.min(homin, ho);
                    // minmin = Math.min(minmin, min);
                    if (ho < (homin)) {
                        homin = ho;
                        minmin = (min);
                    }
                } else if (H >= h1 && M == 0) {
                    int ho = h1 + (24 - (H + 1)) + 1;
                    int min = m1;
                    // System.out.println(ho + " " + min);
                    // homin = Math.min(homin, ho);
                    // minmin = Math.min(minmin, min);
                    if (ho < (homin)) {
                        homin = ho;
                        minmin = (min);
                    }
                }

            }
            // if (homin < 0) {
            // System.out.println(0 + " " + 0);
            // } else {
            // System.out.println(homin + " " + minmin);
            // }
            System.out.println(homin + " " + minmin);

        }
    }
}
