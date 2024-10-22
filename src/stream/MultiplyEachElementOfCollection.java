package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyEachElementOfCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> afterMultiply = list.stream().map(n->n*5).collect(Collectors.toList());
        System.out.println(afterMultiply);
    }
}
