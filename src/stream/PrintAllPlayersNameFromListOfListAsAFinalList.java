package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllPlayersNameFromListOfListAsAFinalList {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Amit","Aman","Vivek","Ujjwal","Atul");
        List<String> list2 = Arrays.asList("Ankit","vibhu","Akash","Rohit");
        List<String> list3 = Arrays.asList("Nishant","Abhishek","Chandan","Abhinav");

        List<List<String>> finalList = Arrays.asList(list1,list2,list3);

        List<String> printList = finalList.stream()
                .flatMap(s->s.stream().map((a)-> a.toLowerCase())).collect(Collectors.toList());
        System.out.println(printList);
    }

}
