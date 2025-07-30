package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionBetweenTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> intersectionList = list1.stream()
                .filter(list2::contains)  // it will check each values from list1 in list2
                .collect(Collectors.toList());

        System.out.println(intersectionList);
    }
}
