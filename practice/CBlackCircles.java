import java.util.Scanner;

public class CBlackCircles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[][] = new long[n][2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextLong();
                }
            }
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            long distSq = (c - a) * (c - a) + (d - b) * (d - b);
            // System.out.println(dist);
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                long x1 = arr[i][0];
                long x2 = arr[i][1];
                long dist1Sq = (c - x1) * (c - x1) + (d - x2) * (d - x2);
                if (dist1Sq <= distSq) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
