import java.util.Scanner;

public class BDeathsBlessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + a[i];
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, b[i]);
            }
            int sum2 = 0;
            if (b.length == 2) {
                sum2 = sum2 + Math.min(b[0], b[n - 1]);
            } else {
                sum2 = sum2 + b[0] + b[n - 1];
            }
            for (int i = 1; i < n - 1; i++) {
                if (b[i] != max) {
                    sum2 = sum2 + 2 * b[i];
                }
            }
            System.out.println((long) sum + sum2);

        }
    }
}

class IntPair {
    private int first;
    private int second;

    public IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        IntPair intPair = (IntPair) o;
        return first == intPair.first && second == intPair.second;
    }

    @Override
    public int hashCode() {
        return 31 * first + second;
    }

    @Override
    public String toString() {
        return first + "-" + second;
    }
}
