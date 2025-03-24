package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumAdMinimumNumberFromAList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 6, 7, 9, 10, 2);
        Optional<Integer> maxNumber = list.stream().max(Integer::compareTo);
        maxNumber.ifPresent(max->System.out.println("maximum number is " + max));
        Optional<Integer> minNumber = list.stream().min(Integer::compareTo);
        minNumber.ifPresent(min-> System.out.println("minimum number is " +min));
    }
}
