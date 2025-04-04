package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeakMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,7,10);
        Stream<Integer> listStream = list.stream()
                .filter(i-> i > 3)
                .peek(i->System.out.println("After filter " +i))
                .map(i-> i*-1)
                .peek(i-> System.out.println("After negating "+i))
                .sorted()
                .peek(i-> System.out.println("After sorting "+i));

        List<Integer>result = listStream.collect(Collectors.toList());
    }
}
