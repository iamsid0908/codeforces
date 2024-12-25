import java.util.Scanner;

public class BArrayCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (i >= y - 1 && i <= x - 1) {
                    a[i] = 1;
                }
            }
            for (int i = x; i < n; i++) {
                if (a[i] == 0) {
                    if (a[i - 1] == 1) {
                        a[i] = -1;
                    } else if (a[i - 1] == -1) {
                        a[i] = 1;
                    }
                }
            }
            for (int i = y - 1; i >= 0; i--) {
                if (a[i] == 0) {
                    if (a[i + 1] == 1) {
                        a[i] = -1;
                    } else if (a[i + 1] == -1) {
                        a[i] = 1;
                    }
                }
            }
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
