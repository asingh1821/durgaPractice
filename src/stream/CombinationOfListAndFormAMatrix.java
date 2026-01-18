package stream;
import java.util.*;
import java.util.stream.Collectors;

public class CombinationOfListAndFormAMatrix {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);
        List<List<Integer>> lol = list1.stream()
                .flatMap((a)-> list2.stream().map(b-> List.of(a,b)))
                .collect(Collectors.toList());

        System.out.println(lol);
    }
}
