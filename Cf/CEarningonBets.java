import java.util.ArrayList;
import java.util.Scanner;

public class CEarningonBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> al = new ArrayList<>();

            ArrayList<Integer> al2 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int ele : a) {
                al2.add(ele);
            }

            int result = a[0];

            for (int i = 1; i < a.length; i++) {
                result = lcm(result, a[i]);
            }

            // System.out.println(result);
            result--;
            for (int i = 0; i < n; i++) {
                al.add((int) Math.ceil((result / ((double) (al2.get(i))))));
            }
            int sum = 0;
            for (int i = 0; i < al.size(); i++) {
                sum = sum + al.get(i);
            }
            result++;
            if (sum >= result) {
                System.out.println(-1);
            } else {
                for (int ele : al) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }

        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
