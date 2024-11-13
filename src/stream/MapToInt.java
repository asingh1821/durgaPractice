package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToInt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2","1","3","5","7");
        int[] mapTOoInt = list.stream()
                .mapToInt(s->Integer.parseInt(s))
                .toArray();

        /**
         * mapToInt() takes each stream string element and convert it into
         * int.
         */
        Arrays.stream(mapTOoInt).forEach(System.out::print);
    }
}
