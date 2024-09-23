package Multiples;

import java.util.stream.IntStream;

public class CleverMultiples3or5 {

    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
