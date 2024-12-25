// package kadansalgo;

public class KadansAlgorithms {
    public static void main(String[] args) {
        int a[] = { 4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1 };
        int curr = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= (a[i] + curr)) {
                curr = curr + a[i];
            } else {
                curr = a[i];
            }
            System.out.println("cur " + curr);
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
