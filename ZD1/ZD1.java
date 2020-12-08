import java.util.Scanner;

public class ZD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        long n = sc.nextLong();
        System.out.println("Enter m:");
        long m = sc.nextLong();
        System.out.println("Enter x1:");
        long x1 = sc.nextLong();
        System.out.println("Enter x2:");
        long x2 = sc.nextLong();
        System.out.println("Enter x3:");
        long x3 = sc.nextLong();
        System.out.println("Enter x4:");
        long x4 = sc.nextLong();
        System.out.println("Enter x5:");
        long x5 = sc.nextLong();
        System.out.println("Enter x6:");
        long x6 = sc.nextLong();
        System.out.println("Enter x7:");
        long x7 = sc.nextLong();
        System.out.println("Enter x8:");
        long x8 = sc.nextLong();
        System.out.println("Enter x9:");
        long x9 = sc.nextLong();
        System.out.println("Enter x10:");
        long x10 = sc.nextLong();
        long[] K = {x1, x2, x3, x4, x5, x6, x7, x8, x9, x10};
        boundValidate(n, m);
        for (long k : K) {
            String range = calcRange(n, m, k);
            System.out.printf("%-5d in range: %s\n", k, range);
        }
    }

    private static String calcRange(long n, long m, long k) {

        if ((k > n) && (k < m)) {
            return "(" + n + ","+ m + ") ";

        } else if (k == n) {
            return "[" + n + ","+ m + "), [" + n + ","+ m + "]";

        } else if (k == m) {
            return "(" + n + ","+ m + "], [" + n + ","+ m + "]";

        } else {
            return "Number of outside the bounds of the ranges;";
        }
    }

    private static void boundValidate(long n, long m) {
        if (n >= m) {
            throw new IllegalArgumentException(
                    "The lower bound of the range must be less than the upper");
        }
    }
}

