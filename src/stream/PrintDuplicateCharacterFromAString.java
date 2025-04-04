package stream;

import java.util.stream.Collectors;

public class PrintDuplicateCharacterFromAString {

    public static void main(String[] args) {
        String s = "Programming";
        s.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(a->a,Collectors.counting()))
                .entrySet().stream().filter(entry-> entry.getValue()>1)
                .forEach(a-> System.out.println("repaeted charcters are :"+a));
    }
}
