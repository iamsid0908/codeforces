import java.util.Scanner;

public class DDigitalstringmaximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            StringBuilder s = new StringBuilder(sc.next());
            int i = 1;
            while (i < s.length()) {
                if ((s.charAt(i) - '0') - (s.charAt(i - 1) - '0') > 1 && s.charAt(i) != '0') {
                    char temp = s.charAt(i);
                    s.setCharAt(i, s.charAt(i - 1));
                    s.setCharAt(i - 1, (char) (temp - 1));
                    i = Math.max(1, i - 1); // Recheck the previous position
                } else {
                    i++;
                }
            }
            System.out.println(s);
        }
    }
}
