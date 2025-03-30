package stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GivenTwoSortedArrayMakeAsingleSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {3,6,4,1,9};
        int[] arr2 = {5,2,7,8,10};

        int[] mergedSortedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted().toArray();
     /*
         .toArray() is used to convert the IntStream into an array.

      */
        System.out.println(Arrays.toString(mergedSortedArray));
    }
}
