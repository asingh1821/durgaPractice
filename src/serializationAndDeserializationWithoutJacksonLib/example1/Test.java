package serializationAndDeserializationWithoutJacksonLib.example1;

import serializationAndDeserializationWithoutJacksonLib.example1.Employee;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("Amit",27,15000);

        // For Serialization

        try (FileOutputStream fos = new FileOutputStream("employee.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp);
            System.out.println("Serialization successful! Object saved in employee.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //For Deserialization

        try(FileInputStream fis = new FileInputStream("employee.ser");
           ObjectInputStream ois = new ObjectInputStream(fis)) {
               Employee employee = (Employee) ois.readObject();
               System.out.println("Deserialization successful!");
               System.out.println("Name: " + emp.getName());
               System.out.println("Age: " + emp.getAge());
               System.out.println("Salary: " + emp.getSalary()); // transient → will be 0.0
           }catch(IOException  | ClassNotFoundException e){
                e.printStackTrace();
           }
    }
}
