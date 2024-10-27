package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int rollNo;
    String name;
    char section;

    public Student(int rollNo,String name,char section){
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;

    }
}
public class PrintStudentListOfList {

    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student(1,"Amit",'A'),
                new Student(2,"Ankit",'C'),
                new Student(3,"Vibhu",'A')
        );
        List<Student> list2 = Arrays.asList(
                new Student(5,"Akash",'A'),
                new Student(6,"Amarjeet",'B'),
                new Student(7,"Sanprit",'C')
        );
        List<List<Student>> finalList = Arrays.asList(list1,list2);
        List<String> s1 = finalList.stream()
                .flatMap(s->s.stream())
                .map(l->l.name)
                .collect(Collectors.toList());
        System.out.println(s1);
    }
}
