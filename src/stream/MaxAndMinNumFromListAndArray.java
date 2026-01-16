package stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxAndMinNumFromListAndArray {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> list = List.of(23,11,56,90,10,-5,100,35);
        int[] arr = {22,56,-2,0,19,18};

        int minL = list.stream()
                .min(Integer::compareTo)
                .orElseThrow(()-> new NoSuchElementException("empty list"));
        System.out.println("min value in list "+ minL);

        int maxL = list.stream()
                .max(Integer::compareTo)
                .orElseThrow(()-> new NoSuchElementException("empty list"));
        System.out.println("max value in list "+maxL);

        int minA = Arrays.stream(arr)
                .min()
                .orElseThrow(()-> new NoSuchElementException("Array is empty"));
        System.out.println("min value in array is: "+minA);

        int maxA = Arrays.stream(arr)
                .max()
                .orElseThrow(()-> new NoSuchElementException("Array is empty"));
        System.out.println("max value in array is: "+ maxA);
    }
}
