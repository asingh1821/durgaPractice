package hashCodeAndEqualsContract.example4;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Employee emp = (Employee) o;
        return name.equals(emp.getName()) && id==emp.getId();
    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(id,name);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
