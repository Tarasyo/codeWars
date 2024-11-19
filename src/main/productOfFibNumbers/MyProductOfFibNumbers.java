package main.productOfFibNumbers;


public class MyProductOfFibNumbers {

    public static long[] productFib(long prod){
        long[] fib = new long[] {0, 1, 1};

        while(fib[0] * fib[1] <= prod){
            if(fib[0] * fib[1] == prod){
                fib[2] = 0;
                return fib;
            }
            long sum = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = sum;
        }
        return fib;
    }
}
