
import java.util.Scanner;

public class A2GardenerandheCapybaras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next();
            // System.out.println(s.substring(0, 1) + " " + s.substring(1, 2) + " " + s.substring(2));
            if ((s.charAt(0) == 'a' && s.charAt(s.length() - 1) == 'a') || (s.charAt(0) == 'b' && s.charAt(s.length() - 1) == 'b')) {
                System.out.println(s.substring(0, 1) + " " + s.substring(1, s.length() - 1) + " " + s.substring(s.length() - 1));
            } else if (s.charAt(0) == 'a' && s.charAt(s.length() - 1) == 'b') {
                int idx = 0;
                int count = 0;
                for (int i = 1; i < s.length() - 1; i++) {

                    if (s.charAt(i) == 'a') {
                        // System.out.println(s.substring(0, i - 1) + " " + s.substring(i, i + 1) + " " + s.substring(i + 1));
                        // break;
                        idx = i;
                        count++;
                    }
                }
                if (count != 0) {
                    System.out.println(s.substring(0, idx) + " " + s.substring(idx, idx + 1) + " " + s.substring(idx + 1));
                } else {
                    System.out.println(s.substring(0, 1) + " " + s.substring(1, s.length() - 1) + " " + s.substring(s.length() - 1));
                }
            } else if (s.charAt(0) == 'b' && s.charAt(s.length() - 1) == 'a') {
                int idx = 0;
                int count = 0;
                for (int i = 1; i < s.length() - 1; i++) {

                    if (s.charAt(i) == 'b') {
                        idx = i;
                        count++;
                    }
                }
                if (count != 0) {
                    // System.out.println(s.substring(0, idx) + " " + s.substring(idx, idx + 1) + " " + s.substring(idx + 1));
                    System.out.println(s.substring(0, 1) + " " + s.substring(1, s.length() - 1) + " " + s.substring(s.length() - 1));

                } else {
                    // System.out.println(s.substring(0, 1) + " " + s.substring(1, s.length() - 1) + " " + s.substring(s.length() - 1));
                    System.out.println(s.substring(0, idx) + " " + s.substring(idx, idx + 1) + " " + s.substring(idx + 1));

                }
            }
        }
    }

    public static int fun(String a, String b, String c) {
        int res1 = b.compareTo(a);
        int res2 = b.compareTo(c);
        // System.out.println(res1 + " " + res2);
        if (res1 >= 0 && res2 >= 0) {
            return 1;
        } else if (res1 <= 0 && res2 <= 0) {
            return 1;
        }
        return 0;
    }
}
