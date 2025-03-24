package stream.sortEmployeeByTheirAge;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int name){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }


}
