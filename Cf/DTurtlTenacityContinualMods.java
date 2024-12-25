import java.util.Arrays;
import java.util.Scanner;

public class DTurtlTenacityContinualMods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int mod = 0;
            for (int i = 0; i < n; i++) {
                mod = mod % arr[i];
            }
            System.out.println(mod);
            if (mod == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
