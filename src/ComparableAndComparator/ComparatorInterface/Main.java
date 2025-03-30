package ComparableAndComparator.ComparatorInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Amit",28,101));
        employeeList.add(new Employee("Akash",25,105));
        employeeList.add(new Employee("Madan",26,100));

        employeeList.sort((e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println(employeeList);
    }
}
