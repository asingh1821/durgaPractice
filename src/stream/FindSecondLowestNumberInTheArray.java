package stream;

import java.util.Arrays;
import java.util.List;

public class FindSecondLowestNumberInTheArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22,22,1,43,89,1,55,23);
        long secondLowest = list.stream()
                .distinct()
                .sorted((i1,i2)-> i1.compareTo(i2))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.print(secondLowest);
    }
}
