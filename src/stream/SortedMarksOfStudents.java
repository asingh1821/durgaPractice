package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMarksOfStudents {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(87);
        marks.add(43);
        marks.add(20);
        marks.add(70);
        marks.add(81);
        marks.add(98);
        marks.add(36);
        System.out.println(marks);
        List<Integer> sortedMarks= marks.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMarks);
    }
}
