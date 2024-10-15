package stream;

import java.util.ArrayList;

public class CountOfFailedStudents {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(20);
        marks.add(33);
        marks.add(57);
        marks.add(27);
        marks.add(89);
        System.out.println(marks);
        long failedCount =  marks.stream().filter(i -> i < 58).count();
        System.out.println(failedCount);


    }
}
