package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<Integer>> listOflist = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9));

//        List<Integer> finalList = listOflist.stream()
//                .flatMap(list-> list.stream())
//                .map(i->i*2)
//                .collect(Collectors.toList());

        // There is two ways where i can use map inside flatmap or can use
        // map outside flatmap

        List<Integer> finalList = listOflist.stream()
                        .flatMap(list->list.stream().map(i->i*2))
                        .collect(Collectors.toList());
        System.out.print(finalList + " ");
    }
}
