package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheElementThatStartsWith1 {

    public static List<String> findElementsThatStartsWith(int[] input){
        return Arrays.stream(input)
                .mapToObj(String::valueOf)
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] input = {1,21,34,11,45,121,87,111};
        List<String> list = findElementsThatStartsWith(input);
        System.out.print(list);
    }
}
