package NonPrimitiveDataTypes;

public class Student {

    public static void main(String[] args) {
        Employee empObject = new Employee();
        empObject.empId = 10;
        modify(empObject);
        System.out.print(empObject.empId);

    }
    public static void modify(Employee employee){
        employee.empId = 20;
    }
}
