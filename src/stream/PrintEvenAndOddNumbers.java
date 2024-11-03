package stream;

import java.util.Arrays;
import java.util.List;

public class PrintEvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(i-> i%2 == 0).forEach(System.out::print);
        System.out.println(" ");
        list.stream().filter(i-> i%2 != 0).forEach(System.out::print);
    }
}
