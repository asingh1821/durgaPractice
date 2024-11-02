package stream;

import java.util.Arrays;
import java.util.List;

public class FindLargestLengthOfStringFromAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit","Ab","Abc","Aaaaa","Vibhu");
        String longestString = list.stream()
                .reduce((s1,s2)->s1.length() >= s2.length() ? s1: s2)
                .orElse(null);

        System.out.print(longestString);
    }
}
