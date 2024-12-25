import java.util.Scanner;

public class AAliceAdventuresinChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s1 = sc.next();
            int x = 0;
            int y = 0;
            StringBuilder s = new StringBuilder(s1);
            for (int i = 0; i <= 15; i++) {
                s.append(s1);
            }
            boolean loose = true;
            for (int i = 0; i < s.length(); i++) {
                if (x == a && y == b) {
                    loose = false;
                    break;
                }
                switch (s.charAt(i)) {
                    case 'N':
                        y = y + 1;
                        break;
                    case 'E':
                        x = x + 1;
                        break;
                    case 'S':
                        y = y - 1;
                        break;
                    case 'W':
                        x = x - 1;
                        break;
                }
            }

            if (loose == false) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
