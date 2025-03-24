package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSecondLargestNumberFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,67,89,67,33,2,1);
        long secondLargest = list.stream()
                .distinct()
                .sorted((i1,i2)->i2.compareTo(i1))
                .skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);

    }
}
