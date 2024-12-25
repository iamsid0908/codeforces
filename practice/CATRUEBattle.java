import java.util.Scanner;

public class CATRUEBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String s1 = "1" + s + "1";
            if (s1.contains("11")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
