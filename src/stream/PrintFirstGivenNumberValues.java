package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintFirstGivenNumberValues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,2,4,8,9,6,45,34,11);

        List<Integer> finalList = list.stream()
                .limit(6).collect(Collectors.toList());

        System.out.print(finalList);
    }
}
