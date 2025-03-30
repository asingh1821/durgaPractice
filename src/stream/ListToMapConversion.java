package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {

    public static void main(String[] args) {

        List<String> list = List.of("banana", "mango", "papaya", "apple");
        Map<String, Integer> map = list.stream().collect(Collectors
                .toMap((item) -> item, String::length));

        System.out.println(map);
    }
}
