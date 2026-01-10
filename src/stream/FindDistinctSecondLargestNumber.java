package stream;

import java.util.Arrays;
import java.util.List;



public class FindDistinctSecondLargestNumber {
    public static void main(String[] args) {
/**
 * first problem is to find second largest no. in a list
 */
        List<Integer> list = Arrays.asList(23, 19, 6, 45, 30, 98, 33, 12);
        long secondLargest = list.stream().distinct()
                .sorted((i1, i2) -> i2-i1)
                .skip(1).findFirst().orElse(null);
        System.out.println("second highest element in the list is "+secondLargest);

        /**
         * find second largest no. from an array, the only diff. from
         * first question and second is that we have to convert IntStream
         * into Stream<Integer>
         */

        int[] arr = {5,7,7,6,6,4};
        int result = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("second highest element in an array is "+ result);


    }
}
