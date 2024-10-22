package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringLength {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit","Saurav","Gaurav","Kunal","VibhuRaj");
        List<Integer> namesLength = names.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(namesLength);
    }
}
