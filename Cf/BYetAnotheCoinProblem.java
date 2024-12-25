import java.util.Scanner;

public class BYetAnotheCoinProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = { 0, 1, 2, 1, 2, 3, 1, 2, 3, 2, 1, 2, 2, 2, 3, 1, 2, 3, 2, 3, 2, 2, 3, 3, 3, 2, 3, 3, 3, 4, 2 };
            if (n / 15 <= 1) {
                System.out.println(arr[n]);
            } else {
                System.out.println((n / 15 - 1) + (arr[n % 15 + 15]));
            }

        }

    }

}
