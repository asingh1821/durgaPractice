package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAListOfStringUsingLambdaFunction {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vibhu","Ankit","Gaurav","Sudhir","Bahubali");
        List<String> sortedNames = names.stream()
                .sorted((s1,s2)-> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.print(sortedNames);
    }
}
