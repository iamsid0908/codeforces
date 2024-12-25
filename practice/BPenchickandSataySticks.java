import java.util.Scanner;

public class BPenchickandSataySticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            // System.out.println(Arrays.toString(arr));
            boolean loose = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    loose = true;
                    break;
                }
            }
            if (loose) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
    // public
}
