package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int empId,String empName,int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary= salary;
    }
}
public class EmployeeThatHasGreaterSalaryAddSome {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(100,"Dhiraj",30000));
        employee.add(new Employee(101,"Mahesh",40000));
        employee.add(new Employee(102,"Dinesh",35000));
        employee.add(new Employee(103,"Suresh",56000));
        employee.add(new Employee(104,"Akhilesh",38000));
        employee.add(new Employee(105,"Akash",67000));

        List<Integer> values = employee.stream()
                .filter(s->s.salary>40000)
                .map(s->s.salary+5000)
                .collect(Collectors.toList());
        System.out.println(values);
    }
}
