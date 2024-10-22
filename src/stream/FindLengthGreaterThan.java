package stream;

import java.util.Arrays;
import java.util.List;

public class FindLengthGreaterThan {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("AmitSingh","VibhuRaj","Ankit","Rishu");
        long countNames = names.stream().filter(s -> s.length() >6  && s.length() <= 9).count();
        System.out.println(countNames);
        names.stream().filter(s -> s.length() > 6 && s.length() <= 9)
                .forEach(System.out::println);
    }
}
