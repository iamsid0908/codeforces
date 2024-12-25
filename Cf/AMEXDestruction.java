import java.util.Scanner;

public class AMEXDestruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char c = '.';
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '.') {
                    c = s.charAt(i);
                    break;
                }
            }
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p') {
                    count++;
                }
            }
            char c1 = '.';
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != '.') {
                    c1 = s.charAt(i);
                    break;
                }
            }

            if ((c == 'p' && count != s.length())) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
