package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAnArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        long sum = list.stream().reduce(0,(x,y)->x+y);
        System.out.print(sum);
    }
}
