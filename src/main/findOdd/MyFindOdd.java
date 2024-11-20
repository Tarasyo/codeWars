package main.findOdd;

public class MyFindOdd {
    public static int findIt(int[] a) {

        int result = 0;
        // XOR all elements in the array
        for (int num : a) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
