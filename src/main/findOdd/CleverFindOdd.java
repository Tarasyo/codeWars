package main.findOdd;

import static java.util.Arrays.stream;

public class CleverFindOdd {
    public class FindOdd {
        public static int findIt(int[] arr) {
            return stream(arr).reduce(0, (x, y) -> x ^ y);
        }
    }
}
