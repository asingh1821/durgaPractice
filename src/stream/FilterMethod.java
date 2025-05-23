package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);
        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0)
                              .collect(Collectors.toList());
        System.out.println(list1);
    }
}
