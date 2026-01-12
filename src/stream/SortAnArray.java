package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {10,4,9,2,8,5,6,3};
        int[] sortedArr = Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToInt((a)-> a)     // it converts an Stream<Integer> into IntStream
                .toArray();
        IntStream.of(sortedArr).forEach(System.out::print);

    }
}
