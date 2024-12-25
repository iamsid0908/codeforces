
import java.util.ArrayList;
import java.util.Scanner;

public class BQuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x = 1;
            ArrayList<Integer> al = new ArrayList();
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    al.add(arr[i]);
                    x++;
                }
            }

            if (n - al.size() == 0) {
                System.out.println(0);
            } else if (n - al.size() == 1) {
                System.out.println(1);
            } else {
                System.out.println((n - al.size() + k - 1) / k);
            }
        }
    }
}
