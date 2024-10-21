package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 19, 6, 45, 30, 98, 33, 12);
        long secondLargest = list.stream().distinct()
                .sorted((i1, i2) -> i2.compareTo(i1))
                .skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);
    }
}
