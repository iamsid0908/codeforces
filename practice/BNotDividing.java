
import java.util.Scanner;

public class BNotDividing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i]++;
                }
            }
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] % arr[i - 1] == 0 && count <= 2 * n) {
                    // continue;;
                    arr[i] = arr[i] + 1;
                    count++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
