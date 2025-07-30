package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSecondLargestNumberFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,2,1);
        long secondLargest = list.stream()
                .distinct()
                .sorted((i1,i2)->i2.compareTo(i1))
                .skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);

        //1st method to calculate sum of all digits
        long res1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of numbers is : "+ res1);

        //2nd method to calculate sum of all digits
        long res2 = list.stream().reduce((a,b)-> a+b).orElse(-1);
        System.out.println("sum of num is: "+ res2);
    }
}
