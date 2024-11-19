package main.productOfFibNumbers;

public class BestProductOfFibNumbers {
    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long tmp = a;
            a = b;
            b = tmp + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }
}
