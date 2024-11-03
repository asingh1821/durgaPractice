package stream;

import java.util.Arrays;
import java.util.List;

public class SecondHighestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,9,5,2,1,232,45,45,232,4);
        long secondHighestNo = list.stream()
                .distinct()
                .sorted((i1,i2)->i2.compareTo(i1))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.print(secondHighestNo);
    }
}
