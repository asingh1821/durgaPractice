package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindListOfSpecificTypedDigit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,34,12,31,6,11,121,91,19);
        List<String> finalList = list.stream()
                .map(String::valueOf) //converts all the integers from list into string
                .filter(s->s.startsWith("3"))
                .collect(Collectors.toList());
        System.out.print(finalList);
    }
}
