import java.util.ArrayList;
import java.util.Scanner;

public class BMakeItUgly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> al = new ArrayList<>();
            int val = a[0];
            int count = 0; // Start with 1 as we count the first element

            for (int i = 0; i < n; i++) {
                if (a[i] == val) {
                    count++;
                } else {

                    al.add(count);
                    count = 0;
                }
            }

            al.add(count);
            int min = al.get(0);
            for (int i = 0; i < al.size(); i++) {
                min = Math.min(min, al.get(i));
            }

            if (min == n) {
                System.out.println(-1);
            } else {
                System.out.println(min);
            }
        }
    }
}
