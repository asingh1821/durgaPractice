package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,4,6,9);
        List<Integer> list2 = Arrays.asList(2,5,7,9,3);
        List<Integer> lol = Stream.concat(list1.stream(), list2.stream())
                .sorted().collect(Collectors.toList());

        lol.forEach(System.out::print);
    }
}
