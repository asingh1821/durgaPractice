package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 25, 30, 40, 21, 33, 90, 56, 34, 15);
        List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);

        list.stream().filter(n -> n%2==0).forEach(System.out::println);
    }
}
