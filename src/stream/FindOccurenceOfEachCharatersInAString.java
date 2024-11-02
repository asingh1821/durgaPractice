package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfEachCharatersInAString {
    public static void main(String[] args) {
        String s = "youareaboy";
        Map<Character,Long> map =  findOccurence(s);
        System.out.print(map);
    }
    public static Map<Character,Long> findOccurence(String s){
        return s.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }
}
