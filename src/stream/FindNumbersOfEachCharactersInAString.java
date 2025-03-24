package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FindNumbersOfEachCharactersInAString {

    public static void main(String[] args) {
        String name = "I am Amit Singh";

        Map<Character, Long> map = name.chars() //converts the string to IntStream
                .mapToObj(c -> (char) c)      //converts the int to the char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key +" "+ value));
    }
}
