package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortTheArray {
    public static void main(String[] args) {
        Integer[] arr = {4,9,12,0,5,2,89,34};
        Stream<Integer> sortedArray = Arrays.stream(arr)
                .sorted();

        // way to print a strem

         sortedArray.forEach(System.out::print);

        }
    }

