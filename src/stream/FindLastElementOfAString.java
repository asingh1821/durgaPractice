package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindLastElementOfAString {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Amit","Aman","Ankit","VIbhu","kanchan");
        Optional<String> getLastName = name.stream()
                .reduce((first,second)-> second);
        getLastName.ifPresent(a-> System.out.println("last name is "+ a));
    }
}
