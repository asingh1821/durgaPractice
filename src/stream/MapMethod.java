package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);
        marks.add(30);
        System.out.println(marks);
        List<Integer> updatedMarks = marks.stream().map(i -> i+5)
                                    .collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}
