public class Binarysearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 4, 4, 4, 4, 5, 6 };
        int l = 0;
        int r = a.length + 1;
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (a[mid - 1] <= 4) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(l);
    }
}
