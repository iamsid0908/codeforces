// import java.util.Scanner;

// public class BANDReconstruction {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t-- > 0) {
// int n = sc.nextInt();
// int b[] = new int[n - 1];
// for (int i = 0; i < n - 1; i++) {
// b[i] = sc.nextInt();
// }
// boolean loose = true;
// b[0] = 0;
// b[n] = 0;

// for (int i = 1; i <= n; i++) {
// a[i] = b[i - 1] | b[i];
// }

// boolean valid = true;
// for (int i = 1; i < n; i++) {
// if ((a[i] & a[i + 1]) != b[i]) {
// valid = false;
// break;
// }
// }

// if (loose) {
// for (int i = 1; i <= n; i++) {
// System.out.print(a[i] + " ");
// }
// System.out.println();
// } else {
// System.out.println(-1);
// }
// }
// }
// }
