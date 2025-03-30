package ComparableAndComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Amit",25,25000));
        list.add(new Employee("Vibhu",30,30000));
        list.add(new Employee("Ankit",28,40000));

        Collections.sort(list,(emp1,emp2)-> emp1.name.compareTo(emp2.name));
        list.forEach((emp)-> System.out.println(emp.salary));

    }
}
