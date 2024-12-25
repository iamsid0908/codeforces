
import java.util.Scanner;

public class BMKnezsConstructiveForcesTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            if (n == 3) {
                System.out.println("No");
                continue;
            } else if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        arr[i] = 1;
                    } else {
                        arr[i] = -1;
                    }
                }
            } else {
                int n1 = n / 2;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        arr[i] = n1 - 1;
                    } else {
                        arr[i] = (-n1);
                    }
                }
            }
            int val = arr[0] + arr[1];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            if(val != sum)
            {
                System.out.println("No");
                continue;
            }
            
            System.out.println("Yes");
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length) {
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
