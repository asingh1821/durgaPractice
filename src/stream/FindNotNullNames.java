package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNotNullNames {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("car",null,"truck","bus","cycle",null,"bike",null);

        names.stream().filter((a)-> a != null).forEach(System.out::println);


        }
    }

