package stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxLengthOfTheString {

    public static void main(String[] args) {
        List<String> los = Arrays.asList("Amit", "aaaaaa","aa","aaa","AmitSingh");
        String res = los.stream()
                .reduce((s1,s2)-> s1.length() >= s2.length()? s1 : s2 )
                .orElse(null);
        System.out.println("largest string is "+res);
    }
}
