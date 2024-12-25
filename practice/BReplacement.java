import java.util.Scanner;

public class BReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int cnto = 0;
            int cnt1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    cnto++;
                } else {
                    cnt1++;
                }
            }
            boolean lose = false;
            for (int i = 0; i < r.length(); i++) {
                if (cnt1 == 0 || cnto == 0) {
                    // System.out.println("No");
                    lose = true;
                    break;
                    // return;
                }
                if (r.charAt(i) == '0') {
                    cnt1--;
                } else {
                    cnto--;
                }
            }

            // System.out.println("Yes");
            if (lose) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
