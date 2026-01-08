package hashCodeAndEqualsContract.example2;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;

    public Employee(){}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Employee emp = (Employee) o;
        return emp.getName() == this.getName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,salary);
    }
}
