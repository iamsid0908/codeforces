import java.util.Scanner;

public class BEveryoneLovesTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextInt();
            // String ans="";
            StringBuilder s = new StringBuilder();
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i <= n - 2) {
                        s.append("3");
                    } else {
                        s.append("6");
                    }
                }
            } else {
                for (int i = 1; i <= n - 4; i++) {
                    s.append("3");
                }
                s.append("6");
                s.append("3");
                s.append("6");
                s.append("6");
            }
            String s4 = s.toString();
            if (s.length() != n) {
                System.out.println(-1);
            } else {
                System.out.println(s4);
            }

        }
    }
}

// 9
// 333336366
