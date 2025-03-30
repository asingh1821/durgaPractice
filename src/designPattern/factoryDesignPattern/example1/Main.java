package designPattern.factoryDesignPattern.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        Employee employee = EmployeeFactory.employeeFactoryMethod(in);
        int webEmp = employee.salary();
        System.out.println(webEmp);
//        Employee emp = EmployeeFactory.employeeFactoryMethod(in);
//        int sal = emp.salary();
//        System.out.println(sal);

    }
}
