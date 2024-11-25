package main.sumOfMultiples;

import java.util.stream.IntStream;

public class MySumOfMultiples {
    public static long sumMul(int n, int m) {
        // TODO implement
        if(n <= 0 || m <= 0) throw new IllegalArgumentException();

        return IntStream.range(n, m)
                .filter(next -> next % n == 0)
                .sum();
    }
}
