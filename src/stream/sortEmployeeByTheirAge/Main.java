package stream.sortEmployeeByTheirAge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Amit", 25, 2000);
        Employee emp2 = new Employee("Ankit", 24,3000);
        Employee emp3 = new Employee("Vibhu", 26, 5000);
        Employee emp4 = new Employee("Gaurav", 27,7000);
        List<Employee> map = Arrays.asList(emp1,emp2,emp3,emp4);
        List<Employee> result = map.stream()
                .sorted((a,b)-> a.getAge()-b.getAge())
                .collect(Collectors.toList());
        result.forEach((employee) -> System.out.print(employee.getAge()+" "));
    }
}
