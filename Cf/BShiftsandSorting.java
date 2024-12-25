import java.util.Scanner;

public class BShiftsandSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            StringBuilder s = new StringBuilder(sc.next());

            // int count = 0;
            long rem = 0;
            long ans = 0;

            for (long i = 0; i < s.length(); i++) {
                if (s.charAt((int) i) == '1') {
                    rem++;
                } else {
                    if (rem > 0) {
                        ans = ans + (rem + 1);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
