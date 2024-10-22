package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertEachStringIntoUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amit","rajesh","sanprit","rahul","lapa");
        List<String> upperCaseNames = names.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

    }
}
