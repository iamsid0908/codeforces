import java.math.BigInteger;
import java.util.*;

public class Education {
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        // solve();
        // solve2();
        // solve3();
        CSumonSegments();// using kadans
    }

    public static void CSumonSegments() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> pre = new ArrayList<>();
            int preidx = -1;
            int val = 0;
            ArrayList<Integer> suffix = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] != 1 && arr[i] != -1) {
                    break; // Stop if an invalid element is encountered
                }
                pre.add(arr[i]);
                preidx = i; // Update the last valid index for `pre`

                // val = arr[i + 1];
            }

            if (preidx + 1 < n) {
                val = arr[preidx + 1];
                for (int i = preidx + 1; i < n; i++) {
                    if (arr[i] == 1 || arr[i] == -1) {
                        suffix.add(arr[i]);
                    }
                }
            }

            // System.out.println("Pre: " + pre);
            // System.out.println("Suffix: " + suffix);
            int premax = maxsumoflist(pre);
            ArrayList<Integer> al = fun(pre);
            int premin = maxsumoflist(al);

            int sumax = maxsumoflist(suffix);
            ArrayList<Integer> al2 = fun(suffix);
            int sumin = maxsumoflist(al2);
            if (premin != 0) {
                premin = premin * (-1);
            }
            if (sumin != 0) {
                sumin = sumin * (-1);
            }
            ArrayList<Integer> preSuff = fun2(pre);
            ArrayList<Integer> Suffpre = prefixSum(suffix);

            System.out.println(preSuff);
            System.out.println(Suffpre);

            int presufmin = Integer.MAX_VALUE;
            int presufmax = 0;
            int sufmin = Integer.MAX_VALUE;
            int sufmax = 0;
            for (int i = 0; i < preSuff.size(); i++) {
                presufmin = Math.min(presufmin, preSuff.get(i));
                presufmax = Math.max(presufmax, preSuff.get(i));
            }
            for (int i = 0; i < Suffpre.size(); i++) {
                sufmin = Math.min(sufmin, Suffpre.get(i));
                sufmax = Math.max(sufmax, Suffpre.get(i));
            }

            // System.out.println("premin " + premin);
            // System.out.println("premax " + premax);

            // System.out.println("sumax " + sumax);
            // System.out.println("sumin " + sumin);
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = premin; i <= premax; i++) {
                ans.add(i);
            }
            for (int i = sumin; i <= sumax; i++) {
                ans.add(i);
            }
            // System.out.println("val " + val);
            int max = sufmax + presufmax + val;
            int min = sufmin + presufmin + val;
            System.out.println("min " + min);
            System.out.println("max " + max);
            for (int i = min; i <= max; i++) {
                ans.add(i);
            }
            Collections.sort(ans);
            HashSet<Integer> hs = new HashSet<>();
            for (int ele : ans) {
                hs.add(ele);
            }
            System.out.println(hs.size());
            // System.out.println(hs);
            for (int ele : hs) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }

    public static ArrayList<Integer> prefixSum(ArrayList<Integer> pre) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0); // Start with 0 (prefix sum for an empty prefix)

        // Iterate through the list
        for (int i = 0; i < pre.size(); i++) {
            // Add the current element to the last prefix sum in `al`
            al.add(pre.get(i) + al.get(al.size() - 1));
        }

        return al;
    }

    public static ArrayList<Integer> fun2(ArrayList<Integer> pre) {
        // suffix sum;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0); // Start with 0 (to handle suffix sum for an empty list or base case)

        // Iterate from the last element to the first
        for (int i = pre.size() - 1; i >= 0; i--) {
            // Add the current element to the last suffix sum in `al`
            al.add(pre.get(i) + al.get(al.size() - 1));
        }

        // Reverse the list to match the order of suffix sums
        Collections.reverse(al);

        return al;
    }

    public static ArrayList<Integer> fun(ArrayList<Integer> pre) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int ele : pre) {
            if (ele == -1) {
                al.add(1);
            } else {
                al.add(-1);
            }
        }
        return al;
    }

    public static int maxsumoflist(ArrayList<Integer> al) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) + curr >= al.get(i)) {
                curr = curr + al.get(i);
            } else {
                curr = al.get(i);
            }
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void solve3() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            List<List<Integer>> result = new ArrayList<>();

            for (int start = 0; start < arr.length; start++) {
                List<Integer> subarray = new ArrayList<>();
                for (int end = start; end < arr.length; end++) {
                    subarray.add(arr[end]);
                    result.add(new ArrayList<>(subarray));
                }
            }
            HashSet<Integer> hs = new HashSet<>();
            hs.add(0);
            // Add the sum of each subarray into the HashSet
            for (List<Integer> subarray : result) {
                int sum = 0;
                for (int num : subarray) {
                    sum += num; // Calculate sum of the current subarray
                }
                hs.add(sum); // Add the sum to the HashSet
            }

            ArrayList<Integer> al = new ArrayList<>();
            for (int ele : hs) {
                al.add(ele);
            }
            // al.add(0);
            Collections.sort(al);
            System.out.println(al.size());
            // System.out.println(hs);
            for (int ele : al) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void solve2() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            int d = sc.nextInt();
            System.out.print(1 + " ");
            if (d % 3 == 0)
                System.out.print(3 + " ");
            if (d % 5 == 0)
                System.out.print(5 + " ");
            if (d % 7 == 0 || d >= 3)
                System.out.print(7 + " ");
            if ((d % 9 == 0 || d >= 6) || (d % 3 == 0))
                System.out.print(9);
        }
    }

    public static BigInteger factorial(long n) {
        BigInteger fact = BigInteger.ONE;
        for (long i = 2; i <= (int) Math.pow((double) n, (double) 1); i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static String fact(long n) {
        int res[] = new int[500];
        res[0] = 1;
        int resSize = 1;

        for (int x = 2; x <= n; x++) {
            resSize = multiply(x, res, resSize);
        }

        StringBuilder result = new StringBuilder();
        for (int i = resSize - 1; i >= 0; i--) {
            result.append(res[i]);
        }

        return result.toString();
    }

    public static int multiply(int x, int res[], int resSize) {
        int carry = 0;

        for (int i = 0; i < resSize; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            res[resSize] = carry % 10;
            carry /= 10;
            resSize++;
        }

        return resSize;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            // StringBuilder result = new StringBuilder();
            // result.append(getMaxCoins(n)).append("\n");
            // System.out.println(result);

            long ans = 1;
            while (n > 3) {
                long val = n / 4;
                ans = ans * 2;
                n = val;
            }
            System.out.println(ans);
        }
    }

    private static long getMaxCoins(long n) {
        // Base case: if n <= 3, we cannot split the coin
        if (n <= 3)
            return 1;

        // Check if we have already computed the result for this value of n
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Recursive computation
        long half = n / 4;
        long maxCoins = 2 * getMaxCoins(half);

        // Store the result in the memoization map
        memo.put(n, maxCoins);

        return maxCoins;
    }
}
