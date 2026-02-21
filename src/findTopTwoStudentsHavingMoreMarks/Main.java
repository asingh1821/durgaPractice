package findTopTwoStudentsHavingMoreMarks;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Amit",2, Arrays.asList(
                new Subject("Physics",99),
                new Subject("Maths",97),
                new Subject("Chem",91)
        ));
        Student student1 = new Student("Ankit",1, Arrays.asList(
                new Subject("Physics",89),
                new Subject("Maths",79),
                new Subject("Chem",90)
        ));
        Student student2 = new Student("Anil",3, Arrays.asList(
                new Subject("Physics",90),
                new Subject("Maths",80),
                new Subject("Chem",70)
        ));
        List<Student> listOfStudents = Arrays.asList(student,student1,student2);
        List<Student> topperList = getTwoTopper(listOfStudents);
        System.out.println(topperList);
    }
    public static List<Student> getTwoTopper(List<Student> students ) {
        List<Student> result = new ArrayList<>();
        if(students == null || students.isEmpty()) {
            return result;
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getTotalMarks()-s1.getTotalMarks();
            }
        });
        result.add(students.get(0));
        result.add(students.get(1));
        return result;
    }
}
