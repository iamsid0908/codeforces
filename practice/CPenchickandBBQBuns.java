import java.util.ArrayList;
import java.util.Scanner;

public class CPenchickandBBQBuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();

            int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 1, 12 };
            ArrayList<Integer> al = new ArrayList<>();
            for (int ele : arr) {
                al.add(ele);
            }

            if (n % 2 == 0) {
                int i = 1;
                int j = 1;
                while (i <= n) {
                    System.out.print(j + " " + j + " ");
                    j++;
                    i += 2;
                }
            } else if (n < 27) {
                System.out.println(-1);
            } else {
                int left = n - 27;
                int i = 0;
                int j = 14;
                while (i < left) {
                    al.add(j);
                    al.add(j);
                    j++;
                    i = i + 2;

                }
                for (int ele : al) {
                    System.out.print(ele + " ");
                }
            }
        }
    }
}
