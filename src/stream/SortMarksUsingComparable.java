package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortMarksUsingComparable {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(74);
        marks.add(34);
        marks.add(67);
        marks.add(82);
        marks.add(28);
        marks.add(54);
        System.out.println(marks);
        List<Integer> sortedMarks = marks.stream().sorted((i1,i2) -> i1.compareTo(i2))
                .collect(Collectors.toList());
        System.out.println(sortedMarks);


    }
}
