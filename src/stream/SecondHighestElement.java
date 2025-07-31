package stream;

import java.util.Arrays;
import java.util.List;

public class SecondHighestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,9,5,2,1,232,45,45,232,4);
        long secondHighestNo = list.stream()
                .distinct()
                .sorted((i1,i2)->i2.compareTo(i1))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestNo);

        
        int[] arr = {1,2,3,4,2,1,3,4,5,2,1,3};
        long maxNum = Arrays.stream(arr).boxed().distinct()
                .sorted((i1,i2)->i2.compareTo(i1)).findFirst().orElse(null);
        System.out.println(maxNum);
    }
}
