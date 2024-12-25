import java.util.Scanner;

public class EBeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int tmp = (3 * x) - y;
        int a = y, b = y, c = tmp - a;
        System.out.println("3\n" + a + " " + b + " " + c);
    }
}
