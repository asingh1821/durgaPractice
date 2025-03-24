package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("A","B","C");
        Stream<String> s2 = Stream.of("D","E","F");
        Stream<String> concateString = Stream.concat(s1,s2);
        List<String> string = concateString.collect(Collectors.toList());
        System.out.println(string);
    }
}
