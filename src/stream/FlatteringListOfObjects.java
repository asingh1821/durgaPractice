package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteringListOfObjects {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,10);
        List<List<Integer>> finalList = Arrays.asList(list1,list2);
        List<Integer> flatList = finalList.stream()
                .flatMap(list->list.stream())
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
