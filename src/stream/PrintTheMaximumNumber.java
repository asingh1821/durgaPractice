package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintTheMaximumNumber {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,45,40,35,89,70,5,56,21};
        List<Integer> streamArray = Arrays.stream(arr)
                .filter(i-> i > 55)
                .peek(i-> System.out.print(i+" ")).collect(Collectors.toList());

        /**
         * .peek() is a method in the Stream API that allows you to
         * perform a non-interfering operation on the elements
         * of a stream as they are processed, without modifying the stream
         */
    }
}
