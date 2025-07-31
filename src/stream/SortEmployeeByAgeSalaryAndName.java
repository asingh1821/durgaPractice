package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employe{
    String name;
    int age;
    int salary;

    public Employe(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }
}

public class SortEmployeeByAgeSalaryAndName {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Employe e1 = new Employe("Amit",27,6000);
        Employe e2 = new Employe("Vibhu", 28,12000);
        Employe e3 = new Employe("Ankit",24, 11000);
        Employe e4 = new Employe("Himanshu", 25, 9000);

        List<Employe> list = Arrays.asList(e1,e2,e3,e4);
        list.stream()
                .sorted((a,b)-> a.getAge()-b.getAge())
                .forEach((a)-> System.out.println(a.getName() + " "+ a.getAge()+" "+a.getSalary()));

        System.out.println("..............");
        list.stream()
                .sorted((a,b)-> b.getSalary()-a.getSalary())
                .forEach((a)->System.out.println(a.getName()+" "+a.getAge()+" "+a.getSalary()));
        System.out.println("..............");
        list.stream()
                .sorted((a,b)-> b.getName().compareTo(a.getName()))
                .forEach((a)->System.out.println(a.getName()+" "+a.getAge()+" "+a.getSalary()));

    }
}