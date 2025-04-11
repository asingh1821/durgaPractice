package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortMarksUsingComparator {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(44);
        marks.add(72);
        marks.add(88);
        marks.add(41);
        marks.add(49);
        marks.add(34);
        marks.add(54);
        System.out.println(marks);
        List<Integer> sortedMarks = marks.stream()
                .sorted((i1, i2)-> ((i1>i2)?-1:(i1<i2)?1:0))
                                     .collect(Collectors.toList());
        System.out.println(sortedMarks);

    }
}
