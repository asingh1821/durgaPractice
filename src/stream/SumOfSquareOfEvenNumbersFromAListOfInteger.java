package stream;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfEvenNumbersFromAListOfInteger {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        int sumOfSquareOfEvenNumber = num.stream()
                .filter(number -> number %2 == 0)
                .mapToInt(number -> number * number)
                .sum();
        System.out.print(sumOfSquareOfEvenNumber);

        }
    }

